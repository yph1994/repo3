package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流的缓冲区问题
 * @author Administrator
 *
 */
public class Bos_flushDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new FileOutputStream("bos.txt");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	String str="让我再看你一遍，从南到北";
	byte[] data=str.getBytes("utf-8");
	bos.write(data);
	/*
	 * void flush()
	 * 将当前缓冲区已缓存的数据一次性写出
	 * 频繁的调用flush会提高实际写出数据的次数
	 * 那么写效率就会降低，但是实际可以改善写出数据的即时性
	 * 结合实际开发需求调用该方法
	 * bos.flush();
	 */
	System.out.println("写出完毕");
	/*
	 * 缓冲流在关闭时会自动flush一次
	 */
	bos.close();		
}
}
