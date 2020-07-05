package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * @author Administrator
 *
 */
public class CopyDemo {
public static void main(String[] args) throws IOException {
	/*
	 * 复制过程
	 * 1.创建文件输入流读取源文件
	 * 2.创建文件输出流用于向复制文件中写
	 * 3.顺序从原文件中读取一组字节（10k）
	 * 然后写入到复制文件中完成复制、
	 * 4.关闭流
	 */
	int len =0;
	FileInputStream pis= new FileInputStream("airplane0.png") ;
	FileOutputStream pos= new FileOutputStream("airplane3.png") ;
	byte[] data=new byte[1024*10];
	
	long start=System.currentTimeMillis();
	while((len=pis.read(data))!=-1){
		pos.write(data, 0, len);
	}
	long end=System.currentTimeMillis();
	System.out.println("复制完毕！耗时："+(end-start)+"ms");
	pis.close();
	pos.close();
	
}
}
