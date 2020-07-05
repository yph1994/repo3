package date;

import java.util.Calendar;

/**
 * void (int filed,int amount)
 * 对指定的时间分量加上给定的值，若给定的值是负数则是减去操作
 * 
 * @author Administrator
 *
 */
public class CalendarDemo4 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	/*
	 * 查看三年两个月二十五天以后是哪天？
	 * 
	 */
	calendar.add(Calendar.YEAR,3);
	calendar.add(Calendar.MONTH,2);
	calendar.add(Calendar.DAY_OF_YEAR,25);
	System.out.println(calendar.getTime());
	
}
}
