package thread;
/**
 * 线程的join方法可以协调线程的同步运行、
 * 同步运行：执行有先后顺序
 * 异步运行：执行没有顺序，各干各的
 * 多线程正常的执行都是异步运行代码的，但是在某些
 * 需求中需要线程间的同步运行
 * @author Administrator
 *
 */
public class JoinDemo {
//表示图片是否下载完毕
	public static boolean isFinish =false;
	public static void main(String[] args) {
		/*
		 * java 语法中有一个要求，当一个方法的局部内部类中若
		 * 引用了这个方法的其他局部变量时，该变量的要求是final的，
		 * 否则编译不通过
		 * 
		 * 但是本案例中isFinish若是局部变量，加上final也不可以，
		 * 因为不可变。但是局部内部类中哟啊改变他的值，因此将其
		 * 提升为属性即可。
		 */
//		boolean isFinish =false;
//		
		Thread download=new Thread(){
		
			public void run() {
			System.out.println("down:开始下载图片...");
			for (int i = 1; i <=100; i++) {
				System.out.println("down："+i+"%");
				
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					
				}
			}
			System.out.println("down:下载完毕");
			isFinish= true;
			}
		};
		Thread show =new Thread(){
			public void run() {
				try {
					System.out.println("开始加载文字");
					Thread.sleep(2000);
					System.out.println("show：显示文字完毕");
					System.out.println("show：开始显示图片");
					//阻塞show线程，等待download执行完毕
				    System.out.println("show：等待download下载图片");
					download.join();
					System.out.println("show：等待完毕！");
					if(!isFinish){
					throw new RuntimeException("图片加载失败");	
					}
					System.out.println("图片加载完成");
				} catch (InterruptedException e) {
			}
			}
		};
		download.start();
		show.start();
		}
}
