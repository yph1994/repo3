package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流连接中使用PrintWriter
 * @author Administrator
 *
 */
public class PWDemo2 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new  FileOutputStream("pw.txt");//字节流 负责写操作
	OutputStreamWriter osw= new OutputStreamWriter(fos,"utf-8");//转换流，字节转化为字符
	BufferedWriter bw =  new  BufferedWriter(osw);//缓冲字符流，
	PrintWriter pw = new PrintWriter(bw);//换行
	pw.println("主题");
	pw.println("不晓得");
	System.out.println("写出完毕");
	pw.close();
}
}
