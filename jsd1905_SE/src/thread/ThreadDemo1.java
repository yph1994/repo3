package thread;
/**
 * ���߳�
 * ���߳���Ҫ����������Ǹı�����ִ�з�ʽ����
 * ԭ�еĴ���һ��һ���Ⱥ�ִ�еġ����С���������Ϊ
 * ����ͬʱִ�еġ����С�����
 * �����̵߳����ַ�ʽ��
 * 1.�̳�Thread��дrun���������߳�����
 */
public class ThreadDemo1 {
 public static void main(String[] args) {
	Thread t1= new Thread1();
	Thread t2= new Thread2();
	/*
	 *�����߳�Ҫ����start����������ֱ�ӵ���run����
	 *start�������ú��߳������̵߳��������������䵽
	 *ʱ��Ƭ����Զ�����run������ʼִ������
	 */
	 t1.start();
	 t2.start();
}
 /**
  * ��һ�ִ����̵߳��ŵ��ǱȽϼ�
  * ����Ҳ�����������㣺
  * 1.����java�ǵ��̳У��⵼������̳���thread���޷�
  * �ټ̳�������ȥ���÷�����ʵ�ʿ����ܲ�����
  * 2.�����̵߳�ͬʱ��дrun�������������⵼���߳�������
  * ��һ����Ȼ����Ϲ�ϵ���������̵߳�����
  */
}
class Thread1 extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			
			System.out.println("�������");
		}
	}
}
class Thread2 extends Thread{

	public void run() {
		for (int i = 0; i < 1000; i++) {
			
			System.out.println("����զ��");
		}
	}
}
