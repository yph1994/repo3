package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * ����������Ļ���������
 * @author Administrator
 *
 */
public class Bos_flushDemo {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new FileOutputStream("bos.txt");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	String str="�����ٿ���һ�飬���ϵ���";
	byte[] data=str.getBytes("utf-8");
	bos.write(data);
	/*
	 * void flush()
	 * ����ǰ�������ѻ��������һ����д��
	 * Ƶ���ĵ���flush�����ʵ��д�����ݵĴ���
	 * ��ôдЧ�ʾͻή�ͣ�����ʵ�ʿ��Ը���д�����ݵļ�ʱ��
	 * ���ʵ�ʿ���������ø÷���
	 * bos.flush();
	 */
	System.out.println("д�����");
	/*
	 * �������ڹر�ʱ���Զ�flushһ��
	 */
	bos.close();		
}
}
