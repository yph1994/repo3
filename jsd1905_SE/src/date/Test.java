package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后按照用户输入自己的生日，格式：yyyy-MM-dd
 * 然后经过程序计算输出到今天为止一共活了活了多少天。
 * 在计算后输出其出生10000天的纪念日是哪天，格式如上
 * @author Administrator
 *
 */
public class Test {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入生日，格式:yyyy-MM-dd");
	String line=sc.nextLine();
	Date now = new Date();
	Date birthday=new Date();
	
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	birthday=sdf.parse(line);
	long day=(now.getTime()-birthday.getTime())/1000/60/60/24;
	System.out.println(day);
	day=birthday.getTime()+10000l*24*60*60*1000;
	now.setTime(day);
    line=sdf.format(now);
    System.out.println(sdf.format(now));

	
	
}
}
