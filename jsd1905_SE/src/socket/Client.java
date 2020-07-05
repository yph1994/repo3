package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author Administrator
 *
 */
public class Client {
	/*
	 * java.net.Socket套接字
	 * 封装了TCP协议的通讯细节，使得我们利用
	 * 通讯以流的读写操作形式完成
	 */
	private Socket socket;

	/**
	 * 构造方法，用于初始化客户端
	 */
	public Client() {
		try {
			/*
			 * s实例化Socket时需要传入两个参数
			 * 1.服务端的地址信息（IP地址）
			 * 2.服务端打开的端口号
			 * 
			 * 这里实例化Socket的过程就是通过给定的
			 * 地址链接服务端的过程，若链接不成功
			 * 构造方法会抛出异常
			 * 通过IP地址 我们可以找到网络上服务端所在的
			 * 机器，通过端口就可以找到运行在服务端计算机
			 * 的服务端应用程序了
			 */
			System.out.println("正在连接服务端...");
			socket= new Socket("176.13.14.175",8111);
			System.out.println("已连接服务端");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 客户端开始工作的方法
	 */
	public void start(){
		try{
			/*
			 * Socket提供的方法
			 * OutputStream getOutputStream（）
			 * 通过返回的字节输出流写出的字节会通过网络
			 * 发送给远端计算机。
			 */
			ServerHandler handler=new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw= new OutputStreamWriter(out,"utf-8");
			BufferedWriter bw = new BufferedWriter (osw);
			PrintWriter pw = new PrintWriter(bw,true);

			Scanner sc= new Scanner(System.in);
			System.out.println("请输入内容");

			String word;
			while(true){
				word=sc.nextLine();
				
				pw.println(word);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Client client= new Client();
		client.start();
	}
	/**
	 * 该线程负责循环读取服务端发送过来的消息并输出到客户端控制台上
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				
				/*
				 * 通过socket获取输入流，读取服务端发送过来的消息
				 */
				InputStream in= socket.getInputStream();
				InputStreamReader isr= new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader (isr);
				String  word =null;
				//读取服务端发送回来的一行字符串
				while((word=br.readLine())!=null){
					System.out.println(word);
					
				}
				
			} catch (Exception e) {
				
			}
			
		}
	}
}
