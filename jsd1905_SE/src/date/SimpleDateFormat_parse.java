package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *��һ���ַ�������ΪDate
 * @author Administrator
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
		String line="2008-08-08 13:45:21";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
         * Date parse(String line)
         * ��һ���ַ�������ָ�������ڸ�ʽ����ΪDate����
         */
        Date date=sdf.parse(line);
        System.out.println(date);
	}

}
