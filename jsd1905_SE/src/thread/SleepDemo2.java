package thread;

import javax.xml.parsers.FactoryConfigurationError;

/**
 * sleep ����Ҫ����봦���ж��쳣
 * ��һ���̵߳���sleep������������״̬�Ĺ����У�
 * �����жϷ���interrupt����������ʱ����ô����
 * ���̵߳�˯����������ʱsleep�����ͻ��׳��ж��쳣
 * @author Administrator
 *
 */
public class SleepDemo2 {
public static void main(String[] args) {
	Thread lin=new Thread(){
	
	public void run() {
		System.out.println("��˯�����ݾ���˯һ��");
		try {
			Thread.sleep(100000);
		} catch (Exception e) {
			System.out.println("�֣������ţ�������");
		}
		System.out.println("�֣�����");
	}

	};
	Thread huang =new Thread(){
		
		public void run() {
			System.out.println("��ʼ��ǽ");
			for (int i = 0; i <5; i++) {
				System.out.println("�ƣ�80");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
			}
			System.out.println("�ѵ�");
			System.out.println("�ƣ��㶨��");
			lin.interrupt();//�ж�lin�̵߳�˯������
		}
	};
	lin.start();
	huang.start();
}
}
