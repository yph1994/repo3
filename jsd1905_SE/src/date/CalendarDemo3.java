package date;

import java.util.Calendar;

/**
 * void set(int filed,int value)
 * ������ǰCalenderָ��ʱ�����Ϊ������ֵ
 * @author Administrator
 *
 */
public class CalendarDemo3 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	//2008-08-08 20:08:08
	calendar.set(2008, 7, 8, 20, 8, 8);
	System.out.println(calendar.getTime());
	calendar.set(Calendar.YEAR, 2018);
	calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
	calendar.set(Calendar.MINUTE, 55);
	calendar.getTime();
	/*
	 * �����Ǿ�����е�calendar.getTime()�ܹؼ���������
	 * �Ǿ�ע�͵���ᷢ������������ڼ������ھͲ���l
	 * ������Ϊset�������ú�����������Calendar��ʱ�����
	 * ֻ����getTimeʱ�Ż���¡�������Щʱ�������Ӱ����ͬ��
	 * ���������ֳ�ͻ�����߻����ǰ�ߵ��޸�
	 * Ϊ�˽��������⣬�����ڵ�������ʽ����getTime����һ��
	 * �����������ĵ�������
	 */
	//set����Ҫ����getTime����,��������set����Ӱ��ͬһ��ʱ�����ʱ�Ժ���Ϊ׼
	calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	System.out.println(calendar.getTime());
	
}
}
