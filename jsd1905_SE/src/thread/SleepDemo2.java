package thread;

import javax.xml.parsers.FactoryConfigurationError;

/**
 * sleep 方法要求必须处理中断异常
 * 当一个线程调用sleep方法处于阻塞状态的过程中，
 * 它的中断方法interrupt（）被调用时，那么会打断
 * 该线程的睡眠阻塞，此时sleep方法就会抛出中断异常
 * @author Administrator
 *
 */
public class SleepDemo2 {
public static void main(String[] args) {
	Thread lin=new Thread(){
	
	public void run() {
		System.out.println("刚睡完美容觉，睡一会");
		try {
			Thread.sleep(100000);
		} catch (Exception e) {
			System.out.println("林：干嘛呐，干嘛呐");
		}
		System.out.println("林：醒了");
	}

	};
	Thread huang =new Thread(){
		
		public void run() {
			System.out.println("开始砸墙");
			for (int i = 0; i <5; i++) {
				System.out.println("黄：80");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}
			System.out.println("哐当");
			System.out.println("黄：搞定了");
			lin.interrupt();//中断lin线程的睡眠阻塞
		}
	};
	lin.start();
	huang.start();
}
}
