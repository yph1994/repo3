package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * 缓冲字符流
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 缓冲流可以提高读写文本数据的效率，并且可以按行读写文本数据
 * java.io.PrinterWriter:具有自动刷新的缓冲字符流
 * 内部连接的BufferedWriter作为其缓冲加速的部分
 * @author Administrator
 *
 */
public class PWDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 向文件中写入文本数据
		 * PrintWriter提供可以对文件直接写操作的构造方法
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * 以上两种是按照系统默认的字符集写字符串、
		 * PrintWriter（String path，String csn)
		 * PrintWriter(File file,String csn)
		 * 以上两种是按照指定的字符集写字符串
		 */
		PrintWriter pw= new PrintWriter("pw.txt","utf-8");
		pw.println("抹茶抹茶");
		pw.println("我最爱喝");
		System.out.println("写出完毕");
		pw.close();
	}

}
