package thread;

import java.util.Scanner;

/**
 * Sleep����
 * �߳��ṩ��̬����
 * static void sleep(long ms)
 * �÷�������������������� ���߳�����ָ������
 * ��ʱ���̻߳��Զ��ص�RUNNABLE״̬�ȴ��ٴβ�������
 * @author Administrator
 *
 */
public class SleepDemo {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("������һ������");
	int num =sc.nextInt();
	for (int i = num; i>=0; i--) {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		e.printStackTrace();
		}
		System.out.println(i);
	}
	System.out.println("ʱ�䵽");
}
}
