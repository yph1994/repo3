package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ʹ��ת����InputStreamReader��ȡ�ı�����
 * @author Administrator
 *
 */
public class ISRDemo {
/*
 * ��osw.txt�ļ��е��ַ���ȡ����
 */public static void main(String[] args) throws IOException {
	
	 FileInputStream fis= new FileInputStream("osw.txt");
	 InputStreamReader isr= new InputStreamReader(fis,"utf-8");
	 int d=-1;
	 /*
	  * �ַ�����int read()������
	  * ��ȡһ���ַ�������ֵ��int���ͷ��أ�����ʵ�ʱ�ʾ
	  * �� ��һ��char��������ֵΪ-1���ʾ����ȡ��ĩβ
	  * �÷���ʵ�ʶ�ȡ�����ֽ�ȡ����ָ�����ַ����Լ�
	  * ʵ�ʶ�ȡ�����ݱ�ʾ���ַ����ݣ������ַ���������
	  * �ж���ȡ�����ֽڻ�ԭ��Ӧ�ַ�
	  */
	 while((d=isr.read())!=-1){
		 System.out.print((char)d);
		 }
		 isr.close();

	}
}
