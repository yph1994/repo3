package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * ����������ʹ��PrintWriter
 * @author Administrator
 *
 */
public class PWDemo2 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos = new  FileOutputStream("pw.txt");//�ֽ��� ����д����
	OutputStreamWriter osw= new OutputStreamWriter(fos,"utf-8");//ת�������ֽ�ת��Ϊ�ַ�
	BufferedWriter bw =  new  BufferedWriter(osw);//�����ַ�����
	PrintWriter pw = new PrintWriter(bw);//����
	pw.println("����");
	pw.println("������");
	System.out.println("д�����");
	pw.close();
}
}
