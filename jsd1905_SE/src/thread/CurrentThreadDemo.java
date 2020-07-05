package thread;
/*
 * 线程提供了一个静态方法：
 * static Thread currentThread();
 * 该方法可以获取运行这个方法的线程
 * java中的所有代码都是靠线程运行的，main方法也不例外
 * 只不过运行main方法的线程不是由我们创建的
 */
public class CurrentThreadDemo {
public static void main(String[] args) {
	Thread main =Thread.currentThread();
	System.out.println("运行main方法的线程是："+main);
	dosome();
	Thread t= new Thread(){
		public void run() {
              Thread t= Thread.currentThread();
              System.out.println("自定义线程："+t);
			dosome();
			
		}
	};
	t.start();
	
}
public  static void dosome() {
	Thread t= Thread.currentThread();
	System.out.println("dosome:"+t);

}
}
