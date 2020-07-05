package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF完成文件复制操作
 * @author Administrator
 *
 */
public class CopyDemo1 {
public static void main(String[] args) throws IOException {
	/*
	 * 创建一个RAF读取源文件
	 * 创建一个RAF用于写复制文件
	 * 循环从源文件中读取每一个字节并写入到复制文件中
	 * 关闭两个RAF
	 */
	RandomAccessFile src =new RandomAccessFile("airplane0.png","r");
	RandomAccessFile copy= new RandomAccessFile("airplanecopy.png","rw");
	int d=-1;
	long start=System.currentTimeMillis();
	while((d=src.read())!=-1){
		copy.write(d);
	}
	long end=System.currentTimeMillis();
	System.out.println("复制完毕!耗时:"+(end-start)+"ms");
	src.close();
	copy.close();
}
}
