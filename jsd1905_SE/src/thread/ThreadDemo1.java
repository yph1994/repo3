package thread;
/**
 * 多线程
 * 多线程主要解决的问题是改变代码的执行方式，将
 * 原有的代码一句一句先后执行的“串行”操作，改为
 * 可以同时执行的“并行”操作
 * 创建线程的两种方式：
 * 1.继承Thread重写run方法定义线程任务
 */
public class ThreadDemo1 {
 public static void main(String[] args) {
	Thread t1= new Thread1();
	Thread t2= new Thread2();
	/*
	 *启动线程要调用start方法而不是直接调用run方法
	 *start方法调用后线程纳入线程调度器管理，当分配到
	 *时间片后会自动调用run方法开始执行任务
	 */
	 t1.start();
	 t2.start();
}
 /**
  * 第一种创建线程的优点是比较简单
  * 但是也存在两个不足：
  * 1.由于java是单继承，这导致如果继承了thread就无法
  * 再继承其他类去复用方法，实际开发很不方便
  * 2.定义线程的同时重写run方法定义任务，这导致线程与任务
  * 有一个必然的耦合关系，不利于线程的重用
  */
}
class Thread1 extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			
			System.out.println("你干嘛那");
		}
	}
}
class Thread2 extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			
			System.out.println("瞧你咋地");
		}
	}
}
