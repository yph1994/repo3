package date;

import java.util.Date;

/**
 * java.util.Date 日期类
 * Date的每一个实例用于表示一个具体的时间点，内部维护一个long值，
 * 表示UTC时间即：1970-01-01 00:00:00到Date表示的时间之间经过的
 * 毫秒
 * 由于Date存在时区和千年虫问题，所以大部分方法在JDK1.1时就被声明
 * 为过时的(都被Calender取代)
 * @author Administrator
 *
 */
public class DateDemo {
public static void main(String[] args) {
	//Date默认创建表示当前系统时间
	 Date now =new Date();
	 System.out.println(now);
	 long time =now.getTime();
	 System.out.println(time);
	 now.setTime(0);
	 System.out.println(now);
	 }
}
