package thread;
/**
 * �̵߳�join��������Э���̵߳�ͬ�����С�
 * ͬ�����У�ִ�����Ⱥ�˳��
 * �첽���У�ִ��û��˳�򣬸��ɸ���
 * ���߳�������ִ�ж����첽���д���ģ�������ĳЩ
 * ��������Ҫ�̼߳��ͬ������
 * @author Administrator
 *
 */
public class JoinDemo {
//��ʾͼƬ�Ƿ��������
	public static boolean isFinish =false;
	public static void main(String[] args) {
		/*
		 * java �﷨����һ��Ҫ�󣬵�һ�������ľֲ��ڲ�������
		 * ��������������������ֲ�����ʱ���ñ�����Ҫ����final�ģ�
		 * ������벻ͨ��
		 * 
		 * ���Ǳ�������isFinish���Ǿֲ�����������finalҲ�����ԣ�
		 * ��Ϊ���ɱ䡣���Ǿֲ��ڲ�����Ӵ���ı�����ֵ����˽���
		 * ����Ϊ���Լ��ɡ�
		 */
//		boolean isFinish =false;
//		
		Thread download=new Thread(){
		
			public void run() {
			System.out.println("down:��ʼ����ͼƬ...");
			for (int i = 1; i <=100; i++) {
				System.out.println("down��"+i+"%");
				
				try {
					Thread.sleep(50);
				} catch (Exception e) {
					
				}
			}
			System.out.println("down:�������");
			isFinish= true;
			}
		};
		Thread show =new Thread(){
			public void run() {
				try {
					System.out.println("��ʼ��������");
					Thread.sleep(2000);
					System.out.println("show����ʾ�������");
					System.out.println("show����ʼ��ʾͼƬ");
					//����show�̣߳��ȴ�downloadִ�����
				    System.out.println("show���ȴ�download����ͼƬ");
					download.join();
					System.out.println("show���ȴ���ϣ�");
					if(!isFinish){
					throw new RuntimeException("ͼƬ����ʧ��");	
					}
					System.out.println("ͼƬ�������");
				} catch (InterruptedException e) {
			}
			}
		};
		download.start();
		show.start();
		}
}
