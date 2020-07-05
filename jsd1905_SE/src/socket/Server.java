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
 * �����ҷ����
 * @author Administrator
 *
 */
public class Server {
	/**
	 * �����ڷ���˵�ServerSocket
	 * ��Ҫ���������ã�
	 * 1.��ϵͳ�������˿ڣ��ͻ��˾���ͨ��
	 * ����˿������˽������ӵ�
	 * 2.�����ö˿ڣ��������ͻ��˽�������ʱ��
	 * ServerSocket�ͻ��Զ�ʵ����һ��Socket
	 * ������ÿͻ��˽������ݽ�����
	 */
	private ServerSocket server;
	/*
	 * ����������пͻ���������Ĺ�������
	 * �ڲ�����Է����ⲿ������������Server
	 * �϶���һ��������Ա�������ClinetHander
	 * ��Ҫ���õ����������������֮�乲������ʹ��
	 */
//	private PrintWriter[]allout={};
	private Collection<PrintWriter> allout=new ArrayList<PrintWriter>();
	/**
	 * ��ʼ�������
	 */
	public Server() {
		try {
			/*ʵ����ServerSocketʱ����򿪵�
			 * ����˿ڡ�����ö˿��Ѿ�������Ӧ��
			 * ����ʹ����ʵ�������̻��׳��쳣
			 * 
			 */
			System.out.println("�������������...");
			server=new ServerSocket(8111);
			System.out.println("������������!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * ����˿�ʼ�����ķ���
	 */
	public void start(){
		try {
			/*
			 * ServerSocket�ṩ�ķ�����
			 * Socket accpet����
			 * �÷�����һ���������������ú�ʼ�ȴ��ͻ������ӣ�
			 * ��һ���ͻ������Ӻ󣬸÷����᷵��һ��Socketʵ��
			 * ͨ�����Socketʵ��������ÿͻ��˽���
			 * 
			 * ��ε���accept�������Խ��ܶ���ͻ��˵�����
			 */
			while(true){
				System.out.println("�ȴ��ͻ�������...");
				Socket socket =server.accept();
				System.out.println("һ���ͻ���������");
				//����һ���߳�������ÿͻ��˽���
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
	 * ���̸߳�����ָ���ͻ��˽��н���
	 */
	private class ClientHander implements Runnable{
		private Socket socket;
		private String host;//Զ�˼������ַ��Ϣ���ͻ��ˣ�
		public ClientHander(Socket socket) {
			this.socket= socket;
			InetAddress address= socket.getInetAddress();
			host=address.getHostAddress();
		}
		public void run(){
			PrintWriter pw=null;
			try {
				/*InputStream getInputStream()
				 * ͨ������������ȡ����������Զ�˼�������͵�����
				 */

				InputStream in= socket.getInputStream();
				InputStreamReader isr= new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader (isr);
				/*
				 * ͨ��Socket��ȡ����������ڽ���Ϣ���͸���ǰ�ͻ���
				 *
				 */
				OutputStream out=socket.getOutputStream();
				OutputStreamWriter osw=new OutputStreamWriter(out,"utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw= new PrintWriter(bw,true);
				/*
				 * ����Ӧ�ÿͻ��˵���������뵽�����������Ա�������ClientHander���Է��ʵ�
				 */
				//��allout����
				synchronized (allout) {
//				allout= Arrays.copyOf(allout, allout.length+1);
//				//����������뵽������
//				allout[allout.length-1]=pw;
					allout.add(pw);
				}
//				System.out.println(host+"�����ˣ���ǰ����������"+allout.length);
				System.out.println(host+"�����ˣ���ǰ����������"+allout.size());
				/*
				 * �ͻ������ڲ���ϵͳ��ͬ�����ͻ��˶Ͽ�ʱ���������ı���Ҳ��ͬ
				 * windows�ͻ��˶Ͽ�����ʱ��readLine���������ֱ���׳��쳣
				 * linux�Ŀͻ��˶Ͽ�����ʱ��readLine�����᷵��Ϊnull
				 */
				String line=null;
				while(( line=br.readLine())!=null){
					System.out.println(host+"�ظ�˵��"+line);
					synchronized (allout){//����Ϣ���͸����пͻ���
//					for (int i = 0; i < allout.length; i++) {
//						
//						allout[i].println(host+"�ظ�˵��"+line);
//					}
						for (PrintWriter o : allout) {
							o.println(host+"�ظ�˵��"+line);	
						}
				}
				}
				System.out.println("����");


			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				//����ͻ��˶Ͽ����Ӻ�Ĳ���
				//���ÿͻ��˵�������ӹ�������allout��ɾ��
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
//				System.out.println(host+"�����ˣ���ǰ����������"+allout.length);
				System.out.println(host+"�����ˣ���ǰ����������"+allout.size());
				try {
					/*
					 * Socket�ṩ��close����������Զ�˼�����Ͽ����ӣ�
					 * ���ͬʱͨ�����Scoket��ȡ���������������
					 * Ҳ�͹ر� ��
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


