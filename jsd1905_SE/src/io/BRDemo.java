package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �����ַ���������java.io.BufferedReader
 * �ص㣺
 * ��߶�ȡ�ı�����Ч�ʣ�������������԰��ж�ȡ�ַ���
 * @author Administrator
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * ����ǰ����Դ�����ȡ�������������������̨��
		 */
		FileInputStream fis= new FileInputStream("src/io/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line =null;
		/*
		 * String readLine()
		 * �����ַ��������ṩ�Ķ��з������÷�����
		 * һ���Զ�ȡһ���ַ�����һ�н����ı�־�Ƕ�ȡ
		 * �����з������Ƿ��ص��ַ����в��������Ļ��з�
		 * ������ֵΪnull�����ʾ����ȡ����ĩβ
		 * ���ĳһ��ֻ�л��з�������ֵΪ���ַ�����
		 * 
		 */
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
