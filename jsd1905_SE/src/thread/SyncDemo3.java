package thread;
/**
 * 静态方法若使用synchronized，那么一定具有同步效果
 * 静态方法默认指定的同步监视器对象为该类的类对象
 * 类对象后面反射知识点会介绍
 * @author Administrator
 *
 */
public class SyncDemo3 {
	public static void main(String[] args) {
		
		Thread t1=new Thread(){
			public void run() {
				Foo.dosome();
			}
		};
		Thread t2=new Thread(){
			public void run() {
				Foo.dosome();
			}
		};
		t1.start();
		t2.start();

	}
}
class Foo{
	public synchronized static void dosome() {
		try {
			Thread t =Thread.currentThread();
			System.out.println(t.getName()+"：正在执行dosome...");
			Thread.sleep(3000);
			System.out.println(t.getName()+"：执行完毕");
		} catch (Exception e) {

		}

	}
}
