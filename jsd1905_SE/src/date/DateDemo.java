package date;

import java.util.Date;

/**
 * java.util.Date ������
 * Date��ÿһ��ʵ�����ڱ�ʾһ�������ʱ��㣬�ڲ�ά��һ��longֵ��
 * ��ʾUTCʱ�伴��1970-01-01 00:00:00��Date��ʾ��ʱ��֮�侭����
 * ����
 * ����Date����ʱ����ǧ������⣬���Դ󲿷ַ�����JDK1.1ʱ�ͱ�����
 * Ϊ��ʱ��(����Calenderȡ��)
 * @author Administrator
 *
 */
public class DateDemo {
public static void main(String[] args) {
	//DateĬ�ϴ�����ʾ��ǰϵͳʱ��
	 Date now =new Date();
	 System.out.println(now);
	 long time =now.getTime();
	 System.out.println(time);
	 now.setTime(0);
	 System.out.println(now);
	 }
}
