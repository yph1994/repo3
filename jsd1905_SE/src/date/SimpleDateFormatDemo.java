package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * ������԰���һ��ָ�������ڸ�ʽ��Date��String
 * �����໥ת��
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
	 * ��������Date�����ʾ�����ڰ���ָ����
	 * ���ڸ�ʽת��ΪString
	 */
	String line=sdf.format(now);
	System.out.println(line);
}
}
