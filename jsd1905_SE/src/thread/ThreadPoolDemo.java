package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * �̳߳�
 * �̳߳���Ҫ����������⣺
 * 1.�����߳��������߳�������������CPU�����л�������
 * ���岢�����ܽ��ͣ����һ��и������Դ����
 * 2.�����̣߳�Ƶ�����������̻߳���̵߳��������������
 * ����������̲߳�Ӧ����������һ�𴴽������٣����Է���
 * ���ã���С������
 * @author Administrator
 *
 */
public class ThreadPoolDemo {
public static void main(String[] args) {
	/*
	 * �����̶���С���̳߳أ�����ʱҪָ���̵߳�����
	 */
	ExecutorService threadPool= Executors.newFixedThreadPool(2);
	for (int i = 0; i < 5; i++) {
		Runnable r=new Runnable() {
			
			
			public void run() {
				try {
					Thread thread=Thread.currentThread();
					System.out.println(thread.getName()+":�Է�");
					Thread.sleep(500);
					System.out.println(thread.getName()+":ϴ��");
				} catch (Exception e) {
				e.printStackTrace();
				}
				
			}
		};
		threadPool.execute(r);
		System.out.println("ָ����һ������");
	}
	threadPool.shutdown();//���������
//	threadPool.shutdownNow();//����ֹͣ
}
}
