package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��ȡ�ı�����
 * @author Administrator
 *
 */
public class ReadStringDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile raf= new RandomAccessFile("raf.txt","r");
	//��ȡ�ļ������ַ�
	//����һ�����ļ�����һ�����ֽ�����
	byte[]data=new byte[(int)raf.length()];
	//һ���Խ��ļ������ֽڶ�ȡ��������
	raf.read(data);
	//�������ֽ������������ֽڰ���ָ���ַ���ת��Ϊ�ַ���
	String str =new String(data,"utf-8");
	System.out.println(str);
}
}
