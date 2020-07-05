package thread;
/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源时，由于线程切换的时机不确定
 * 导致操作顺序发生混乱情况，严重时可能导致系统瘫痪
 * 临界资源：同一时刻只能被一条线程处理的资源
 * @author Administrator
 *
 */
public class SyncDemo {
public static void main(String[] args) {
	Table table= new Table();
	Thread t1=new Thread(){
		public void run() {
        while(true){
        	int bean=table.getBean();
        	Thread.yield();
        	System.out.println(getName()+":"+bean);
        }
		}
	};
	Thread t2=new Thread(){
		public void run() {
			while(true){
				int bean=table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
			}
		}
	};
	t1.start();
	t2.start();
}
}
class Table{
	private int beans=20;
	/**
	 * 当一个分使用关键字synchronized修饰后，
	 * 这个方法称为同步方法
	 * 同步方法要求多个线程不能同时进入到方法内部运行
	 * 必须“排队”进行（同步运行）
	 * @return
	 */
	public  synchronized int getBean() {
		if(beans==0){
			throw new RuntimeException("没有豆子");
		}
		Thread.yield();//主动让出CPU时间，模拟线程
		return beans--;
	}
}