package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题：
 * 1.控制线程数量，线程数量过多会造成CPU过度切换，导致
 * 整体并发性能降低，并且会有更多的资源开销
 * 2.重用线程，频繁创建销毁线程会给线程调度器带来额外的
 * 负担，因此线程不应当随着任务一起创建并销毁，可以反复
 * 利用，减小开销。
 * @author Administrator
 *
 */
public class ThreadPoolDemo {
public static void main(String[] args) {
	/*
	 * 创建固定大小的线程池，创建时要指定线程的数量
	 */
	ExecutorService threadPool= Executors.newFixedThreadPool(2);
	for (int i = 0; i < 5; i++) {
		Runnable r=new Runnable() {
			
			
			public void run() {
				try {
					Thread thread=Thread.currentThread();
					System.out.println(thread.getName()+":吃饭");
					Thread.sleep(500);
					System.out.println(thread.getName()+":洗碗");
				} catch (Exception e) {
				e.printStackTrace();
				}
				
			}
		};
		threadPool.execute(r);
		System.out.println("指派了一个任务");
	}
	threadPool.shutdown();//运行完结束
//	threadPool.shutdownNow();//立即停止
}
}
