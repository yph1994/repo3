package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * ��ʾ�����û���Ϣ
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
		System.out.println("�û���:"+username);
		System.out.println("����:"+password);
		System.out.println("�ǳ�:"+nickname);
		System.out.println("����:"+age);
	}
	System.out.println("pos:"+raf.getFilePointer());
	raf.close();
}

}
