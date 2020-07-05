package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室服务端
 * @author Administrator
 *
 */
public class Server {
	/**
	 * 运行在服务端的ServerSocket
	 * 主要有两个作用：
	 * 1.向系统申请服务端口，客户端就是通过
	 * 这个端口与服务端建立连接的
	 * 2.监听该端口，这样当客户端建立连接时，
	 * ServerSocket就会自动实例化一个Socket
	 * 用于与该客户端进行数据交换。
	 */
	private ServerSocket server;
	/*
	 * 用来存放所有客户端输出流的共享数组
	 * 内部类可以访问外部类的属性因此在Server
	 * 上定义一个数组可以保存所有ClinetHander
	 * 需要互访的输出流，做到他们之间共享数据使用
	 */
//	private PrintWriter[]allout={};
	private Collection<PrintWriter> allout=new ArrayList<PrintWriter>();
	/**
	 * 初始化服务端
	 */
	public Server() {
		try {
			/*实例化ServerSocket时传入打开的
			 * 服务端口。如果该端口已经被其他应用
			 * 程序使用则实例化过程会抛出异常
			 * 
			 */
			System.out.println("正在启动服务端...");
			server=new ServerSocket(8111);
			System.out.println("服务端启动完毕!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 服务端开始工作的方法
	 */
	public void start(){
		try {
			/*
			 * ServerSocket提供的方法：
			 * Socket accpet（）
			 * 该方法是一个阻塞方法，调用后开始等待客户端连接，
			 * 当一个客户端连接后，该方法会返回一个Socket实例
			 * 通过这个Socket实例即可与该客户端交互
			 * 
			 * 多次调用accept方法可以接受多个客户端的连接
			 */
			while(true){
				System.out.println("等待客户端连接...");
				Socket socket =server.accept();
				System.out.println("一个客户端连接了");
				//启动一个线程来处理该客户端交互
				ClientHander handler = new ClientHander(socket);
				Thread t= new Thread(handler);
				t.start();
			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Server server= new Server();
		server.start();
	}
	/*
	 * 该线程负责与指定客户端进行交互
	 */
	private class ClientHander implements Runnable{
		private Socket socket;
		private String host;//远端计算机地址信息（客户端）
		public ClientHander(Socket socket) {
			this.socket= socket;
			InetAddress address= socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run(){
			PrintWriter pw=null;
			try {
				/*InputStream getInputStream()
				 * 通过该输入流读取到的内容是远端计算机发送的数据
				 */

				InputStream in= socket.getInputStream();
				InputStreamReader isr= new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader (isr);
				/*
				 * 通过Socket获取输出流，用于将消息发送给当前客户端
				 *
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw= new PrintWriter(bw,true);
				/*
				 * 将对应该客户端的输出流存入到共享数组中以便其他的ClientHander可以访问到
				 */
				//对allout扩容
				synchronized (allout) {
//				allout= Arrays.copyOf(allout, allout.length+1);
//				//将输出流存入到数组中
//				allout[allout.length-1]=pw;
					allout.add(pw);
				}
//				System.out.println(host+"上线了，当前在线人数："+allout.length);
				System.out.println(host+"上线了，当前在线人数："+allout.size());
				/*
				 * 客户端由于操作系统不同，当客户端断开时服务端这里的表现也不同
				 * windows客户端断开连接时，readLine方法这里会直接抛出异常
				 * linux的客户端断开连接时，readLine方法会返回为null
				 */
				String line=null;
				while(( line=br.readLine())!=null){
					System.out.println(host+"回复说："+line);
					synchronized (allout){//将消息发送给所有客户端
//					for (int i = 0; i < allout.length; i++) {
//						
//						allout[i].println(host+"回复说："+line);
//					}
						for (PrintWriter o : allout) {
							o.println(host+"回复说："+line);	
						}
				}
				}
				System.out.println("结束");


			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//处理客户端断开连接后的操作
				//将该客户端的输出流从共享数组allout中删除
//				int index=0;
//				 PrintWriter[]a=new PrintWriter[allout.length];
//				 for (int i = 0; i < allout.length; i++) {
//					if(pw!=allout[i]){
//                     	a[index]=allout[i];
//                     	index++;
//					}
//					 
//				}
//				 allout=Arrays.copyOf(a, index);
				synchronized (allout){
//					for (int i = 0; i < allout.length; i++) {
//					if(allout[i]==pw){
//						allout[i]=allout[allout.length-1];
//						allout=Arrays.copyOf(allout, allout.length-1);
//						break;
//					}
					allout.remove(pw);
//				System.out.println(host+"下线了，当前在线人数："+allout.length);
				System.out.println(host+"下线了，当前在线人数："+allout.size());
				try {
					/*
					 * Socket提供的close方法可以与远端计算机断开连接，
					 * 与此同时通过这个Scoket获取的输入流与输出流
					 * 也就关闭 了
					 */
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				}
			}
			}
		}


}


