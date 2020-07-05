package thread;
/**
 * 使用匿名内部类完成线程的两种创建
 * @author Administrator
 *
 */
public class ThreadDemo3 {
public static void main(String[] args) {
	//1直接继承Thread重写run方法
	Thread t1= new Thread (){
	
		public void run() {
			for (int i = 0; i < 1000; i++) {
			System.out.println("元气满满");	
			}
		
		}
	};
	Thread main=Thread.currentThread();
	System.out.println(main);
	t1.start();
	
	//2实现Runnable接口

	Runnable r2= new Runnable() {
		
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("岳岳大骚猪");	
				}
		}
	};
	Thread t2= new Thread(r2);
	t2.start();
}
}
