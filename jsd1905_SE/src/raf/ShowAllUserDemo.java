package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 显示所有用户信息
 */
public class ShowAllUserDemo {public static void main(String[] args) throws IOException {
	
	RandomAccessFile raf=new RandomAccessFile("user.dat","r");
	for (int i = 0; i < raf.length()/100; i++) {
		byte[] data = new byte[32];
		raf.read(data);
		String username= new String(data,"utf-8").trim();
		
		raf.read(data);
		String password= new String(data,"utf-8").trim();
		
		raf.read(data);
		String nickname= new String(data,"utf-8").trim();
		
		int age =raf.readInt();
		System.out.println("用户名:"+username);
		System.out.println("密码:"+password);
		System.out.println("昵称:"+nickname);
		System.out.println("年龄:"+age);
	}
	System.out.println("pos:"+raf.getFilePointer());
	raf.close();
}

}
