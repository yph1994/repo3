package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件数据
 */
public class Demo2 {
public static void main(String[] args) throws IOException {
	/*
	 * int read()
	 * 从文件中读取一个字节，并以int型返回
	 * 若返回值为-1，则表示文件末尾
	 */
	RandomAccessFile raf=new RandomAccessFile("raf.dat","r");
	int d=raf.read();
	System.out.println(d);
	int d1=raf.read();
	System.out.println(d1);
	int d2=raf.read();
	System.out.println(d2);
	
}
}
