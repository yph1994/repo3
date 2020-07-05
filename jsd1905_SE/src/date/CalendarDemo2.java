package date;

import java.util.Calendar;

import javax.swing.plaf.synth.SynthStyle;

/**
 * Calendar�ṩ��һ��������
 * int get(int field)
 * ���Ի�ȡ��ǰCalenderָ��ʱ�������Ӧ��ֵ
 * ��ͬʱ�������һ����ͬ��intֵ��ʾ��Calender
 * �ṩ�˴�����int�ͳ�����ʾ��ͬ��ֵ��ֱ�����ü��ɡ�
 */
public class CalendarDemo2 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	int year=calendar.get(Calendar.YEAR);
	int month=calendar.get(Calendar.MONTH)+1;//�´�0��ʼ��0��ʾ1��
	/*
	 * ��ȡ�գ��͡��족��ص�ʱ�����
	 * DAY_OF_WEEK:���ڼ�
	 * DAY_OF_MONTH:���е���
	 * DAY_OF_YEAR:���е���
	 * DATE�����е���
	 */
	int day=calendar.get(Calendar.DATE);
	int hour=calendar.get(Calendar.HOUR_OF_DAY);//24Сʱ
	int minute=calendar.get(Calendar.MINUTE);
	int second=calendar.get(Calendar.SECOND);
	
	System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
    int days=calendar.get(Calendar.DAY_OF_WEEK)-1;//�����ܼ���һ�ܵĵ�һ��Ϊ����
    String []arr={"��","һ","��","��","��","��","��"};
    System.out.println("����������"+arr[days]);
    /*
     * ��ȡ����ʱ���������������ֵ
     * �ο�����ΪCalender����ʾ������
     */
	calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println(days);
	System.out.println(Integer.MAX_VALUE);
	
}
}
