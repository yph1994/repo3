package date;

import java.util.Calendar;

/**
 * void set(int filed,int value)
 * 调整当前Calender指定时间分量为给定的值
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
	 * 上面那句输出中的calendar.getTime()很关键，把上面
	 * 那句注释掉后会发现下面调整星期几后日期就不对l
	 * 这是因为set方法调用后不是立即调整Calendar的时间分量
	 * 只有在getTime时才会更新。但是有些时间分量会影响相同的
	 * 内容这会出现冲突，后者会替代前者的修改
	 * 为了解决这个问题，可以在调整后显式调用getTime清算一下
	 * 后再做后续的调整工作
	 */
	//set完需要调用getTime方法,否则当两个set方法影响同一个时间分量时以后者为准
	calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
	System.out.println(calendar.getTime());
	
}
}
