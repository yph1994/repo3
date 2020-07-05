package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 练习：完成一个简易记事本工具
 * 程序启动后，要求用户控制台输入文件名，然后通过RAF打开该文件
 * 之后用户在控制台输入的每行字符串都写入到这个文件中
 * 当用户单独输入“exit”程序退出
 * 
 * 注：输入的文件内容不考虑换行
 * @author Administrator
 *
 */
public class NotDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名");
		String  name= sc.next();
		File file= new File(name);
		RandomAccessFile raf= new RandomAccessFile(name,"rw");
		System.out.println("请输入内容,输入exit结束");

		while(true){
			String txt=sc.next();
			if("exit".equals(txt)){//字符串字面equals字符串可以避免空指针异常
				break;}
				raf.write(txt.getBytes("UTF-8"));
		System.out.println("结束");}
		raf.close();
	
	}
}
