package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ�������ļ��ĸ��Ʋ���
 * @author Administrator
 *
 */
public class CopyDemo {
public static void main(String[] args) throws IOException {
	/*
	 * ���ƹ���
	 * 1.�����ļ���������ȡԴ�ļ�
	 * 2.�����ļ���������������ļ���д
	 * 3.˳���ԭ�ļ��ж�ȡһ���ֽڣ�10k��
	 * Ȼ��д�뵽�����ļ�����ɸ��ơ�
	 * 4.�ر���
	 */
	int len =0;
	FileInputStream pis= new FileInputStream("airplane0.png") ;
	FileOutputStream pos= new FileOutputStream("airplane3.png") ;
	byte[] data=new byte[1024*10];
	
	long start=System.currentTimeMillis();
	while((len=pis.read(data))!=-1){
		pos.write(data, 0, len);
	}
	long end=System.currentTimeMillis();
	System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
	pis.close();
	pos.close();
	
}
}
