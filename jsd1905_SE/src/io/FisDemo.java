package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ļ���������
 * ���ڴ��ļ��ж�ȡ�ֽ�
 * @author Administrator
 *
 */
public class FisDemo {public static void main(String[] args) throws IOException {
	
	FileInputStream fis = new FileInputStream("fos.txt");
	byte[] data=new byte[1000];
	int len =fis.read(data);
	/*
	 * �������ֽ������д�ָ���±�λ�ÿ�ʼ������len��
	 * �ֽڰ���ָ�����ַ�ת��Ϊ�ַ���
	 */
	String str=new String(data,0,len,"utf-8");
	System.out.println(str);
	fis.close();
}
}
