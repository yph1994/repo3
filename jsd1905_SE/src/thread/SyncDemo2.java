package thread;



/**
 * ͬ����
 * �﷨��
 * synchronized��ͬ������������{
 * ��Ҫͬ�����еĴ���Ƭ��
 * }
 * ��Ч����Сͬ����Χ���Ա�֤������ȫ��ǰ�������
 * ����Ч�ʣ�ʹ��ͬ������Ը�׼ȷ��������Ҫͬ�����е�
 * ����Ƭ��
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
 * �ڷ�����ʹ��synchronizedҲ����ͬ������������ģ�
 * ���ö�����Ƿ�����������this��
 */
	//   public synchronized void buy(){
	public  void buy(){
		try {
			Thread t =Thread.currentThread();
			System.out.println(t.getName()+"���������·�...");
			Thread.sleep(5000);
			/*
			 * sʹ��ͬ����Ҫ��ָ��ͬ�����������󣬼�����������
			 * �ö��������java���κ����͵�ʵ����ֻҪ��֤���
			 * �߳̿����ĸö����ǡ�ͬһ�������ɣ�����û��ͬ��Ч����
			 */
			synchronized (this) {
				//		   synchronized (new Object())  {//������ͬ��û��ͬ��Ч��

				System.out.println(t.getName()+"�������·�...");
				Thread.sleep(5000);
			}
			System.out.println("�����뿪");


		} catch (Exception e) {

		}
	}
}
