package thread;
/**
 * ��̬������ʹ��synchronized����ôһ������ͬ��Ч��
 * ��̬����Ĭ��ָ����ͬ������������Ϊ����������
 * �������淴��֪ʶ������
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
			System.out.println(t.getName()+"������ִ��dosome...");
			Thread.sleep(3000);
			System.out.println(t.getName()+"��ִ�����");
		} catch (Exception e) {

		}

	}
}
