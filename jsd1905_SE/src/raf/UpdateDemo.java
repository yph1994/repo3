package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成 * 程序启动后要求输入用户名和新的昵称
用户昵称修改功能
 * 然后将user.dat文件中该用户的昵称进行修改
 * 如果输入用户不存在，则提示查无此人
 * @author Administrator
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名");
		String name=sc.nextLine();
		System.out.println("请输入新昵称");
		String nick=sc.nextLine();
		RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
		int flag=0;
		for (int i = 0; i < raf.length()/100; i++) {
			raf.seek(i*100);
			byte[] data = new byte[32];
			raf.read(data);
			String username= new String(data,"utf-8").trim();
			if(name.equals(username)){
				data=nick.getBytes("utf-8");
				data=Arrays.copyOf(data, 32);
				raf.seek(i*100+64);
				raf.write(data);
				System.out.println("昵称修改完毕");
				flag=1;
				break;
					}
		}
		if(flag==0){
			System.out.println("查无此人");
		}else{
		System.out.println("运行完成");
		}
		raf.close();
	}
}
