package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ��� * ����������Ҫ�������û������µ��ǳ�
�û��ǳ��޸Ĺ���
 * Ȼ��user.dat�ļ��и��û����ǳƽ����޸�
 * ��������û������ڣ�����ʾ���޴���
 * @author Administrator
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������û���");
		String name=sc.nextLine();
		System.out.println("���������ǳ�");
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
				System.out.println("�ǳ��޸����");
				flag=1;
				break;
					}
		}
		if(flag==0){
			System.out.println("���޴���");
		}else{
		System.out.println("�������");
		}
		raf.close();
	}
}
