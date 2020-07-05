package thread;

import java.lang.reflect.Method;

/**
 * 互斥锁
 * 当使用synchronized锁定多个代码片段时，并且指定的同步监视器对象时同一个时，
 * 这些代码片段就是互斥的，多个线程不能同时执行这些代码片段
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
			System.out.println(t.getName()+":正在执行A...");
			Thread.sleep(3000);
			System.out.println(t.getName()+":执行结束");

		} catch (Exception e) {

		}
	}
	public synchronized void methodB() {
		try {
			Thread t=Thread.currentThread();

			System.out.println(t.getName()+":正在执行B...");
			Thread.sleep(3000);
			System.out.println(t.getName()+":执行结束");

		} catch (Exception e) {

		}
	}
		public  void methodC() {
			synchronized(this){
				try {

					Thread t=Thread.currentThread();

					System.out.println(t.getName()+":正在执行C...");
					Thread.sleep(3000);
					System.out.println(t.getName()+":执行结束");

				} catch (Exception e) {

				}
			}
		}
	}