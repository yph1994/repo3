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
 * �����ҿͻ���
 * @author Administrator
 *
 */
public class Client {
	/*
	 * java.net.Socket�׽���
	 * ��װ��TCPЭ���ͨѶϸ�ڣ�ʹ����������
	 * ͨѶ�����Ķ�д������ʽ���
	 */
	private Socket socket;

	/**
	 * ���췽�������ڳ�ʼ���ͻ���
	 */
	public Client() {
		try {
			/*
			 * sʵ����Socketʱ��Ҫ������������
			 * 1.����˵ĵ�ַ��Ϣ��IP��ַ��
			 * 2.����˴򿪵Ķ˿ں�
			 * 
			 * ����ʵ����Socket�Ĺ��̾���ͨ��������
			 * ��ַ���ӷ���˵Ĺ��̣������Ӳ��ɹ�
			 * ���췽�����׳��쳣
			 * ͨ��IP��ַ ���ǿ����ҵ������Ϸ�������ڵ�
			 * ������ͨ���˿ھͿ����ҵ������ڷ���˼����
			 * �ķ����Ӧ�ó�����
			 */
			System.out.println("�������ӷ����...");
			socket= new Socket("176.13.14.175",8111);
			System.out.println("�����ӷ����");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * �ͻ��˿�ʼ�����ķ���
	 */
	public void start(){
		try{
			/*
			 * Socket�ṩ�ķ���
			 * OutputStream getOutputStream����
			 * ͨ�����ص��ֽ������д�����ֽڻ�ͨ������
			 * ���͸�Զ�˼������
			 */
			ServerHandler handler=new ServerHandler();
			Thread t = new Thread(handler);
			t.start();
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw= new OutputStreamWriter(out,"utf-8");
			BufferedWriter bw = new BufferedWriter (osw);
			PrintWriter pw = new PrintWriter(bw,true);

			Scanner sc= new Scanner(System.in);
			System.out.println("����������");

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
	 * ���̸߳���ѭ����ȡ����˷��͹�������Ϣ��������ͻ��˿���̨��
	 */
	private class ServerHandler implements Runnable{
		public void run() {
			try {
				
				/*
				 * ͨ��socket��ȡ����������ȡ����˷��͹�������Ϣ
				 */
				InputStream in= socket.getInputStream();
				InputStreamReader isr= new InputStreamReader(in,"utf-8");
				BufferedReader br = new BufferedReader (isr);
				String  word =null;
				//��ȡ����˷��ͻ�����һ���ַ���
				while((word=br.readLine())!=null){
					System.out.println(word);
					
				}
				
			} catch (Exception e) {
				
			}
			
		}
	}
}
