package thread;



/**
 * 同步块
 * 语法：
 * synchronized（同步监视器对象）{
 * 需要同步运行的代码片段
 * }
 * 有效的缩小同步范围可以保证并发安全的前提下提高
 * 并发效率，使用同步块可以更准确的锁定需要同步运行的
 * 代码片段
 * @author Administrator
 *
 */
public class SyncDemo2 {
	public static void main(String[] args) {
		Shop shop = new Shop();
//		Shop shop1=new Shop();
//		Shop shop2=new Shop();
		Thread t1=new Thread(){

			public void run() {

				shop.buy();
			}
		};

		Thread t2=new Thread(){

			public void run() {

				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}
}
class Shop{
/*
 * 在方法上使用synchronized也是有同步监视器对象的，
 * 而该对象就是方法所属对象“this”
 */
	//   public synchronized void buy(){
	public  void buy(){
		try {
			Thread t =Thread.currentThread();
			System.out.println(t.getName()+"：正在挑衣服...");
			Thread.sleep(5000);
			/*
			 * s使用同步块要求指定同步监视器对象，即：上锁对象
			 * 该对象可以是java中任何类型的实例，只要保证多个
			 * 线程看到的该对象是“同一个”即可，否则没有同步效果！
			 */
			synchronized (this) {
				//		   synchronized (new Object())  {//锁对象不同，没有同步效果

				System.out.println(t.getName()+"正在试衣服...");
				Thread.sleep(5000);
			}
			System.out.println("结账离开");


		} catch (Exception e) {

		}
	}
}
