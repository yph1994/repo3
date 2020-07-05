package thread;

import java.lang.reflect.Method;

/**
 * ������
 * ��ʹ��synchronized�����������Ƭ��ʱ������ָ����ͬ������������ʱͬһ��ʱ��
 * ��Щ����Ƭ�ξ��ǻ���ģ�����̲߳���ͬʱִ����Щ����Ƭ��
 * @author Administrator
 *
 */
public class SyncDemo4 {
	public static void main(String[] args) {
		Boo boo =new Boo();
		Thread t1=new Thread(){
			public void run() {
				boo.methodA();
			}
		};
		Thread t2=new Thread(){
			public void run() {
				boo.methodB();
			}
		};
		Thread t3=new Thread(){
			public void run() {
				boo.methodC();
			}
		};
		t1.start();
		t2.start();
		t3.start();

	}
}
class Boo{
	public synchronized void methodA() {
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName()+":����ִ��A...");
			Thread.sleep(3000);
			System.out.println(t.getName()+":ִ�н���");

		} catch (Exception e) {

		}
	}
	public synchronized void methodB() {
		try {
			Thread t=Thread.currentThread();

			System.out.println(t.getName()+":����ִ��B...");
			Thread.sleep(3000);
			System.out.println(t.getName()+":ִ�н���");

		} catch (Exception e) {

		}
	}
		public  void methodC() {
			synchronized(this){
				try {

					Thread t=Thread.currentThread();

					System.out.println(t.getName()+":����ִ��C...");
					Thread.sleep(3000);
					System.out.println(t.getName()+":ִ�н���");

				} catch (Exception e) {

				}
			}
		}
	}