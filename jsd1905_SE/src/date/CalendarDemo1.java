package date;

import java.util.Calendar;
import java.util.Date;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * java.util.Calender ������
 * Calendar��һ�����ʱ��ܷ����API��ʹ�������Է����
 * ����ʱ�䣬��ȡʱ����Ϣ������ʱ��ȡ�
 * Calendar������һ�������࣬�涨�����������ʱ���һ�鷽��
 * ����ʵ���ࣺGregorianCalendar����������ʵ����
 * @author Administrator
 *
 */
public class CalendarDemo1 {
public static void main(String[] args) {
	Calendar calender=Calendar.getInstance();
	System.out.println(calender);
	/*
	 * Date getTime()
	 * Calendar��getTime�����Ὣ�����ʾ��ʱ����һ��
	 * Dateʵ����ʽ����
	 */
	Date date=calender.getTime();
	System.out.println(date);
	/*
	 * void seTime(Date date)
	 * ������ǰCalendar��ʾ������Date����ʾ��ʱ��
	 */
	calender.setTime(date);
	
	
}
}
