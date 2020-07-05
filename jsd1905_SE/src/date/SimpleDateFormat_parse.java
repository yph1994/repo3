package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *将一个字符串解析为Date
 * @author Administrator
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
		String line="2008-08-08 13:45:21";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        /*
         * Date parse(String line)
         * 将一个字符串按照指定的日期格式解析为Date对象
         */
        Date date=sdf.parse(line);
        System.out.println(date);
	}

}
