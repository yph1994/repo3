package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 使用转换流InputStreamReader读取文本数据
 * @author Administrator
 *
 */
public class ISRDemo {
/*
 * 将osw.txt文件中的字符读取出来
 */public static void main(String[] args) throws IOException {
	
	 FileInputStream fis= new FileInputStream("osw.txt");
	 InputStreamReader isr= new InputStreamReader(fis,"utf-8");
	 int d=-1;
	 /*
	  * 字符流的int read()方法：
	  * 读取一个字符，返回值以int类型返回，但是实际表示
	  * 的 是一个char，若返回值为-1则表示流读取到末尾
	  * 该方法实际读取几个字节取决于指定的字符集以及
	  * 实际读取的数据表示的字符内容，但是字符流会自行
	  * 判定读取几个字节还原对应字符
	  */
	 while((d=isr.read())!=-1){
		 System.out.print((char)d);
		 }
		 isr.close();

	}
}
