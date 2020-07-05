package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 实现简易记事本工具、
 * 创建PW以自行完成流连接的方式，然后按行写入文件，当输入exit时程序退出
 * @author Administrator
 *
 */
public class PWDemo3 {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner (System.in);
	System.out.println("请输入文件名");
	String name= sc.nextLine();
	String word;
	System.out.println("请输入内容");
	FileOutputStream fos = new  FileOutputStream(name+".txt");//字节流 负责写操作
	OutputStreamWriter osw= new OutputStreamWriter(fos,"utf-8");//转换流，字节转化为字符
	BufferedWriter bw =  new  BufferedWriter(osw);//缓冲字符流，
	PrintWriter pw = new PrintWriter(bw,true);//换行
	/*
       PrintWriter的构造方法如果第一个参数为流
             那么就可以在出啊进入一个boolean型的参数，该值
             为true，则具有自动行刷新的功能
             每当调用println方法时，会自动flush 
	 */

	while(true){
		  word= sc.nextLine();
		if("exit".equals(word)){
		break;
	}
		pw.println(word);
	}
	System.out.println("写出完毕");
	pw.close();
}
}
