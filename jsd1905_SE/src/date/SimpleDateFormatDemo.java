package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 该类可以按照一个指定的日期格式将Date和String
 * 进行相互转换
 * @author Administrator
 *
 */
public class SimpleDateFormatDemo {
   public static void main(String[] args) {
	Date now=new Date();
	System.out.println(now);
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a E");
	/*
	 * String format(Date date)
	 * 将给定的Date对象表示的日期按照指定的
	 * 日期格式转换为String
	 */
	String line=sdf.format(now);
	System.out.println(line);
}
}
