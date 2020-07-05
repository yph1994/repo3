package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 * @author Administrator
 *
 */
public class ReadStringDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile raf= new RandomAccessFile("raf.txt","r");
	//读取文件所有字符
	//创建一个与文件长度一样的字节数组
	byte[]data=new byte[(int)raf.length()];
	//一次性将文件所有字节读取到数组中
	raf.read(data);
	//将给定字节数组中所有字节按照指定字符集转换为字符串
	String str =new String(data,"utf-8");
	System.out.println(str);
}
}
