package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ļ�����
 */
public class Demo2 {
public static void main(String[] args) throws IOException {
	/*
	 * int read()
	 * ���ļ��ж�ȡһ���ֽڣ�����int�ͷ���
	 * ������ֵΪ-1�����ʾ�ļ�ĩβ
	 */
	RandomAccessFile raf=new RandomAccessFile("raf.dat","r");
	int d=raf.read();
	System.out.println(d);
	int d1=raf.read();
	System.out.println(d1);
	int d2=raf.read();
	System.out.println(d2);
	
}
}
