package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * �����ַ���
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * ������������߶�д�ı����ݵ�Ч�ʣ����ҿ��԰��ж�д�ı�����
 * java.io.PrinterWriter:�����Զ�ˢ�µĻ����ַ���
 * �ڲ����ӵ�BufferedWriter��Ϊ�仺����ٵĲ���
 * @author Administrator
 *
 */
public class PWDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * ���ļ���д���ı�����
		 * PrintWriter�ṩ���Զ��ļ�ֱ��д�����Ĺ��췽��
		 * PrintWriter(String path)
		 * PrintWriter(File file)
		 * ���������ǰ���ϵͳĬ�ϵ��ַ���д�ַ�����
		 * PrintWriter��String path��String csn)
		 * PrintWriter(File file,String csn)
		 * ���������ǰ���ָ�����ַ���д�ַ���
		 */
		PrintWriter pw= new PrintWriter("pw.txt","utf-8");
		pw.println("Ĩ��Ĩ��");
		pw.println("�����");
		System.out.println("д�����");
		pw.close();
	}

}
