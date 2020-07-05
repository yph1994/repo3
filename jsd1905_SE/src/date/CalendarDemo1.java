package date;

import java.util.Calendar;
import java.util.Date;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * java.util.Calender 日历类
 * Calendar是一组操作时间很方便的API，使用它可以方便的
 * 调整时间，获取时间信息，计算时间等。
 * Calendar本身是一个抽象类，规定了日历类操作时间的一组方法
 * 常用实现类：GregorianCalendar，即：阳历实现类
 * @author Administrator
 *
 */
public class CalendarDemo1 {
public static void main(String[] args) {
	Calendar calender=Calendar.getInstance();
	System.out.println(calender);
	/*
	 * Date getTime()
	 * Calendar的getTime方法会将自身表示的时间以一个
	 * Date实例形式返回
	 */
	Date date=calender.getTime();
	System.out.println(date);
	/*
	 * void seTime(Date date)
	 * 调整当前Calendar表示给定的Date所表示的时间
	 */
	calender.setTime(date);
	
	
}
}
