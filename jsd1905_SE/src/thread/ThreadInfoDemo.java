package thread;
/**
 * 获取 线程信息的相关方法
 */

public class ThreadInfoDemo {
public static void main(String[] args) {
	Thread main=Thread.currentThread();
	//获取线程名字
	String name = main.getName();
	System.out.println("name:"+name);
	
	//获取唯一标识
	long id = main.getId();
	System.out.println("id:"+id);
	//获取线程优先级
	int priority= main.getPriority();
	System.out.println("优先级："+priority);
	//线程是否活着
	boolean isAlive = main.isAlive();
	//是否为守护线程
	boolean isDaemon =main.isDaemon();
	//线程是否中断
	boolean isInterrupted=main.isInterrupted();
	System.out.println("是否活着："+isAlive);
	System.out.println("是否为守护线程："+isDaemon);
	System.out.println("是否被中断："+isInterrupted);
}
}
