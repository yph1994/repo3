package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * ʵ�ּ��׼��±����ߡ�
 * ����PW��������������ӵķ�ʽ��Ȼ����д���ļ���������exitʱ�����˳�
 * @author Administrator
 *
 */
public class PWDemo3 {
public static void main(String[] args) throws IOException {
	Scanner sc = new Scanner (System.in);
	System.out.println("�������ļ���");
	String name= sc.nextLine();
	String word;
	System.out.println("����������");
	FileOutputStream fos = new  FileOutputStream(name+".txt");//�ֽ��� ����д����
	OutputStreamWriter osw= new OutputStreamWriter(fos,"utf-8");//ת�������ֽ�ת��Ϊ�ַ�
	BufferedWriter bw =  new  BufferedWriter(osw);//�����ַ�����
	PrintWriter pw = new PrintWriter(bw,true);//����
	/*
       PrintWriter�Ĺ��췽�������һ������Ϊ��
             ��ô�Ϳ����ڳ�������һ��boolean�͵Ĳ�������ֵ
             Ϊtrue��������Զ���ˢ�µĹ���
             ÿ������println����ʱ�����Զ�flush 
	 */

	while(true){
		  word= sc.nextLine();
		if("exit".equals(word)){
		break;
	}
		pw.println(word);
	}
	System.out.println("д�����");
	pw.close();
}
}
