package thread;
/**
 * ʹ�������ڲ�������̵߳����ִ���
 * @author Administrator
 *
 */
public class ThreadDemo3 {
public static void main(String[] args) {
	//1ֱ�Ӽ̳�Thread��дrun����
	Thread t1= new Thread (){
	
		public void run() {
			for (int i = 0; i < 1000; i++) {
			System.out.println("Ԫ������");	
			}
		
		}
	};
	Thread main=Thread.currentThread();
	System.out.println(main);
	t1.start();
	
	//2ʵ��Runnable�ӿ�

	Runnable r2= new Runnable() {
		
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("������ɧ��");	
				}
		}
	};
	Thread t2= new Thread(r2);
	t2.start();
}
}
