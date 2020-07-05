package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量，减少实际读写次数是
 * 可以提高读写效率的
 * 
 * 单字节读写一般也称为随机读写形式
 * 一组字节一组字节的读写一般也称为块读写形式
 * 
 * 对于机械硬盘而言，块读写的效率是不错的
 * 
 * @author Administrator
 *
 */
public class CopyDemo2 {
public static void main(String[] args) throws IOException {
	RandomAccessFile src= new RandomAccessFile("tts9.zip","r");
	RandomAccessFile desc= new RandomAccessFile("tts9_cp.zip","rw");
	/*
	 * int read(byte[]data)
	 * 一次性读取给定字节数组总长度的字节量，并
	 * 存入到该数组，返回值为实际读取到的字节量，若返回值
	 * 为-1则表示文件末尾
	 */
	/*
	 * void write (byte[]data)
	 * 一次性将给定字节数组中所有字节写出
	 * void write(byte[]data,int offset,int len)
	 * 将给定的字节数组 从下标offset处的连续len个字节
	 * 一次性写出
	 */
	int len =1;//记录每次实际读取的字节数
	byte [] data=new byte [1024*10];
	long start=System.currentTimeMillis();
	while((len=src.read(data))!=-1){
		desc.write(data, 0, len);
	}
	long end=System.currentTimeMillis();
	System.out.println("复制完毕！耗时："+(end-start)+"ms");
	src.close();
	desc.close();
}
}
