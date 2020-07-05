package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java io
 * java  标准的输入输出
 * java IO 使我们可以标准的读写操作对外界设备
 * 进行读写或写操作
 * IO将读写分成两大类型
 * 输入流：java.io.InputStream，所有字节输入流都继承自它、
 * 它规定了读取字节的相关方法，这意味着所有字节输入流都具有该
 * 方法，使我们可以使用相同的方法利用不同的字节输入读取不同
 * 设备的数据
 * 
 * 输出流：java.io.OutputStream,所有字节输入流都继承自它，规定了
 * 写出字节的相关方法
 * 
 * java将流分为两种：
 * 节点流：低级流，是实际连接程序与数据源的“管道”，负责实际搬运数据的流
 * 读写是一定是建立在节点流的基础上进行的
 * 处理流：高级流，不能独立存在，必须连接在其他流上，目的是当数据流经当前
 * 高级流时对数据进行某种加工处理，简化我们读写数据时对其加工操作
 * 实际用于IO时，我们通常会串联若干高级流最终连接到低级流上，使得读写数据
 * 以流水线的加工处理，这个过程称为“流的连接”,这也是IO的精髓所在
 * 
 * 
 * 文件流
 * java.io.FileOutputStream
 * java.io.FileInputStream 
 * 文件流是一对低级流，是用来读写文件数据的流
 * 文件流与RAF的区别：
 * 首先他们都是用来读写文件数据的，但是RAF是基于指针的随机读写，
 * 因此可以读写文件的任意位置，读写方式灵活，可以编辑文件的部分数据
 * 文件流是基于JAVA IO的标准读写，而IO是顺序读写形式，即：
 * 只能顺序读或者写，是不能回退的，因此在读写方式上不如RAF灵活，但是基于IO
 * 流连接操作将来可以串联高级流将复杂读写简单化，而这一点RAF是做不到的
 * 
 * @author Administrator
 *
 */
public class FOSdemo {
public static void main(String[] args) throws UnsupportedEncodingException, IOException {
	/*
	 * 向文件fos.txt中写入字符串
	 */
	/*
	 * 文件流的两种创建方式:
	 * FileOutputStream(String path)
	 * FileOutputStream(File file)
	 * 以上形式创建的文件流是覆盖模式，
	 * 若操作文件已经存在，那么会将该文件原有
	 * 数据全部删除，然后将通过当前流写入的数据
	 * 作为文件数据保留。
	 * FileOutputStream(String path，boolean append)
	 * FileOutputStream(File file，boolean append)
	 * 以上形式创建的文件流为追加写模式，
	 * 若文件已经存在，那么原数据都保留，通过
	 * 当前流写出的内容会被追加在文件末尾。
	 */
//	FileOutputStream fos =new FileOutputStream("fos.txt");
	FileOutputStream fos =new FileOutputStream("fos.txt",true);
	/*
	 * void write(byte[] data)
	 * 向文件中写出一组字节
	 */
	fos.write("状态不佳".getBytes("utf-8"));
	System.out.println("写出完毕");
	fos.close();
	
}
}
