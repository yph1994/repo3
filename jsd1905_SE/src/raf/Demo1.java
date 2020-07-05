package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 基于指针对文件数据进行随机读写
 * 创建RAF时有两种常见的创建模式：
 * 1.只读模式“r”，仅能读取文件数据，不可做写操作
 * 2.读写模式“rw”，对文件数据可进行读写操作
 * @author Administrator
 *
 */
public class Demo1 {
public static void main(String[] args) throws IOException {
	/*
	 * 常见的RAF构造方法
	 * RandomAccessFile(String path ,String mode)
	 * RandomAccessFile(File file ,String mode)
	 * 第一个参数为要操作的文件、
	 * 第二个参数为模式，支持的字符串常用的为：
	 * “r”：只读          “rw”：读写
	 */
	//对当前目录下 的raf.dat文件读写操作
	RandomAccessFile raf= new RandomAccessFile("raf.dat","rw");
	/*
	 * void write (int d)
	 * 向文件中写入1个字节，写入的是给定的int值
	 * 所对应的2进制的“低8位”
	 */
	raf.write(257);
	raf.write(1);
	System.out.println("写出完毕");
	raf.close();
}
}
