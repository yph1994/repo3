package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件输入流：
 * 用于从文件中读取字节
 * @author Administrator
 *
 */
public class FisDemo {public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("fos.txt");
	byte[] data=new byte[1000];
	int len =fis.read(data);
	/*
	 * 将给定字节数组中从指定下标位置开始的连续len个
	 * 字节按照指定的字符转换为字符串
	 */
	String str=new String(data,0,len,"utf-8");
	System.out.println(str);
	fis.close();
}
}
