package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * �������������û������Լ������գ���ʽ��yyyy-MM-dd
 * Ȼ�󾭹�����������������Ϊֹһ�����˻��˶����졣
 * �ڼ������������10000��ļ����������죬��ʽ����
 * @author Administrator
 *
 */
public class Test {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("���������գ���ʽ:yyyy-MM-dd");
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
