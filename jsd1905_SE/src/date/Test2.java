package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * ������Ʒ��������
 * ����������Ҫ������ĳ��Ʒ�������ڣ�yyyy-MM-dd
 * Ȼ��������һ������Ϊ�����ڵ�������
 * �������������������Ʒ�������ڣ���ʽͬ��
 * �����ռ��������Ʒ������ǰ���ܵ�����
 */
public class Test2 {
public static void main(String[] args) throws ParseException {
	Scanner sc=new Scanner(System.in);
	System.out.println("��������������");
	String line= sc.nextLine();
	System.out.println("�����뱣������");
	int num= sc.nextInt();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	Date dir=sdf.parse(line);
	Calendar calendar=Calendar.getInstance();
	calendar.setTime(dir);
	calendar.add(Calendar.DAY_OF_YEAR, num-14);
	calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
    line=sdf.format(calendar.getTime());
    System.out.println("����ʱ��"+line);
	
	
}
}
