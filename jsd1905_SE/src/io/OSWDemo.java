package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * java�������ն�д�����ݵ�λ���л���
 * �ֽ��������ֽ�Ϊ��λ��д���ݣ�����ΪInputStream
 *        ��OutputStream
 *�ַ��������ַ�Ϊ��λ��д���ݣ�����Reader��Writer
 *�ַ���ֻ���ڶ�д�ı����ݣ��ײ�ʵ�ʻ��Ƕ�д�ֽ�
 *�����ַ����ֽڵ�ת�������ַ������������
 *
 *
 *ת����
 *java.io.InputStreamReader
 *java.io.OutputStreamWriter
 *������һ�Ը߼�����������ʵ�ʿ����в�ֱ�Ӳ�������
 *�������������������𵽺���Ҫ�����á�ʹ�����ν�
 *�����ַ������ֽ����ģ�java���������ַ�������������
 *��ֻ�������������ַ����ϣ�����ֱ���������ֽ����ϣ�
 *
 * @author Administrator
 *
 */
public class OSWDemo {
public static void main(String[] args) throws IOException {
	/*
	 * ���ı���д���ı�����
	 */
	FileOutputStream fos = new FileOutputStream("osw.txt");
	OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
	osw.write("���������ɽ�ʹ�");
	osw.write("Ҳ������ɽ�˺�");
	System.out.println("д�����");
	osw.close();
}
}
