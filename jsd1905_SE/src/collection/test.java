package collection;

import java.nio.charset.MalformedInputException;
import java.util.Random;

public class test {

 private String str ="张三";
 private String str1 ="李四";
 private String str2 ="王五";
 private StringBuilder sb= new StringBuilder(str);
 private StringBuilder sb1= new StringBuilder(str1);
 private StringBuilder sb2= new StringBuilder(str2);

public test(String str,String str1,String str2) {
    for (int i = 0; i < 1000; i++) {
		Random ran = new Random();
		int c= ran.nextInt(3);
		int cc= ran.nextInt(10000);
		String string= String.valueOf(cc);
		if(c==0){sb.append(cc);}
		if(c==1){sb1.append(cc);}
		if(c==2){sb2.append(cc);}
		
				}
   
}
 
 
}
