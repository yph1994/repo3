package thread;
/**
 * 线程优先级
 * 线程优先级一共有10级，分别对应整数1-10
 * 其中1最低，5默认，10最高
 * 理论上线程优先级越高获取的CPU时间片的次数越多
 * 线程启动后变纳入到线程调度器中同一管理，线程不能主动
 * 索取时间片，只能被动被分配，我们可以通过调整线程
 * 的优先级最大程度改善线程获取CPU时间片的几率 
 * @author Administrator
 *
 */
public class PriorityDemo {
public static void main(String[] args) {
	Thread min= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("min");
			}
		}
	};
	Thread max= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("max");
			}
		}
	};
	Thread norm= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("norm");
			}
		}
	};
	//设置线程优先级
	max.setPriority(Thread.MAX_PRIORITY);
	min.setPriority(Thread.MIN_PRIORITY);
	norm.setPriority(Thread.NORM_PRIORITY);
	min.start();
	max.start();
	norm.start();
}
}
