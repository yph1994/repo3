package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * java将流按照读写的数据单位进行划分
 * 字节流：以字节为单位读写数据，超类为InputStream
 *        和OutputStream
 *字符流：以字符为单位读写数据，超类Reader，Writer
 *字符流只用于读写文本数据，底层实际还是读写字节
 *但是字符与字节的转化工作字符流自行完成了
 *
 *
 *转换流
 *java.io.InputStreamReader
 *java.io.OutputStreamWriter
 *他们是一对高级流，将来在实际开发中不直接操作他们
 *但是他们在流连接中起到很重要的作用。使用来衔接
 *其他字符流与字节流的（java中其他的字符流在流连接上
 *都只能连接在其他字符流上，不能直接连接在字节流上）
 *
 * @author Administrator
 *
 */
public class OSWDemo {
public static void main(String[] args) throws IOException {
	/*
	 * 向文本中写入文本数据
	 */
	FileOutputStream fos = new FileOutputStream("osw.txt");
	OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
	osw.write("我曾经跨过山和大海");
	osw.write("也穿过人山人海");
	System.out.println("写出完毕");
	osw.close();
}
}
