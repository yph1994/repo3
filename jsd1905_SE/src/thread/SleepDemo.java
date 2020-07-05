package thread;

import java.util.Scanner;

/**
 * Sleep阻塞
 * 线程提供静态方法
 * static void sleep(long ms)
 * 该方法可以让运行这个方法 的线程阻塞指定毫秒
 * 超时后线程会自动回到RUNNABLE状态等待再次并发运行
 * @author Administrator
 *
 */
public class SleepDemo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入一个数字");
	int num =sc.nextInt();
	for (int i = num; i>=0; i--) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("时间到");
}
}
