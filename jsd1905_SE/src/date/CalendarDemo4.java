package date;

import java.util.Calendar;

/**
 * void (int filed,int amount)
 * ��ָ����ʱ��������ϸ�����ֵ����������ֵ�Ǹ������Ǽ�ȥ����
 * 
 * @author Administrator
 *
 */
public class CalendarDemo4 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	/*
	 * �鿴���������¶�ʮ�����Ժ������죿
	 * 
	 */
	calendar.add(Calendar.YEAR,3);
	calendar.add(Calendar.MONTH,2);
	calendar.add(Calendar.DAY_OF_YEAR,25);
	System.out.println(calendar.getTime());
	
}
}
