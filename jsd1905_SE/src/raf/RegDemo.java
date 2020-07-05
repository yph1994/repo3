package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能
 * 程序启动后，要求用户输入：用户名，密码，昵称，年龄
 * 然后将该记录写入文件user.dat中保存
 * @author Administrator
 *其中：用户名，密码，昵称为字符串，
 *     年龄为int值
 *     每条记录占用100字节，其中用户名，密码，昵称各占
 *     32字节（实际内容不够的补充到32字节），年龄为固定的
 *     4字节
 */
public class RegDemo {
public static void main(String[] args) throws IOException {
	Scanner sc =new Scanner(System.in);
	System.out.println("欢迎注册");
	System.out.println("请输入用户名");
	String username=sc.nextLine();
	System.out.println("请输入密码");
	String password=sc.nextLine();
	System.out.println("请输入昵称");
	String nickname=sc.nextLine();
	System.out.println("请输入年龄");
	int age=Integer.parseInt(sc.nextLine());
	RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
	//现将指针移动到文件末尾，以便追加新纪录
	raf.seek(raf.length());
	byte []data=username.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	data=password.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	data=nickname.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	raf.writeInt(age);
	System.out.println("注册完成");
	raf.close();
	
}
}
