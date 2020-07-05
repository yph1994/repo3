package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写出String到文件中
 * @author Administrator
 *
 */
public class WriteStringDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
	String line ="回首~掏~";
	/*
	 * getBytes("UTF-8");
	 * 将字符串转化为字节可以使用String提供的方法
	 * byte[] getBytes()
	 * 按照系统默认的字符集转化为字节（不推荐）
	 * byte[] getByte(String csn)
	 * 按照给定的字符集将字符串转为为字节
	 * 常用字符集
	 * UTF-8：unicode的编码，也称为万国码，其中英文1字节，中文3字节
	 * GBK：国标编码，英文1字节，中文2字节
	 * ISO8859-1:欧洲的编码集，不支持中文，
	 * 字符集名称不区分大小写
	 * 
	 */
	byte[]data=line.getBytes("UTF-8");
	raf.write(data);
	raf.write("鬼刀一开看不见走位走位".getBytes("UTF-8"));
	System.out.println("写出完毕");
	raf.close();
}
}
