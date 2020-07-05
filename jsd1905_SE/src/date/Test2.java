package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后要求输入某商品生产日期：yyyy-MM-dd
 * 然后在输入一个数字为保质期的天数。
 * 经过程序运算输入该商品促销日期，格式同上
 * 促销日计算规则：商品过期日前两周的周三
 */
public class Test2 {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入生产日期");
	String line= sc.nextLine();
	System.out.println("请输入保质日期");
	int num= sc.nextInt();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	Date dir=sdf.parse(line);
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(dir);
	calendar.add(Calendar.DAY_OF_YEAR, num-14);
	calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
    line=sdf.format(calendar.getTime());
    System.out.println("促销时间"+line);
	
	
}
}
