package date;

import java.util.Calendar;

import javax.swing.plaf.synth.SynthStyle;

/**
 * Calendar提供了一个方法：
 * int get(int field)
 * 可以获取当前Calender指定时间分量对应的值
 * 不同时间分量用一个不同的int值表示，Calender
 * 提供了大量的int型常量表示不同的值，直接引用即可。
 */
public class CalendarDemo2 {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	int year=calendar.get(Calendar.YEAR);
	int month=calendar.get(Calendar.MONTH)+1;//月从0开始，0表示1月
	/*
	 * 获取日，和“天”相关的时间分量
	 * DAY_OF_WEEK:星期几
	 * DAY_OF_MONTH:月中的天
	 * DAY_OF_YEAR:年中的天
	 * DATE：月中的天
	 */
	int day=calendar.get(Calendar.DATE);
	int hour=calendar.get(Calendar.HOUR_OF_DAY);//24小时
	int minute=calendar.get(Calendar.MINUTE);
	int second=calendar.get(Calendar.SECOND);
	
	System.out.println(year+"-"+month+"-"+day+" "+hour+":"+minute+":"+second);
    int days=calendar.get(Calendar.DAY_OF_WEEK)-1;//今天周几，一周的第一天为周日
    String []arr={"日","一","二","三","四","五","六"};
    System.out.println("今天是星期"+arr[days]);
    /*
     * 获取给定时间分量所允许的最大值
     * 参考日期为Calender所表示的日期
     */
	calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println(days);
	System.out.println(Integer.MAX_VALUE);
	
}
}
