package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * д��String���ļ���
 * @author Administrator
 *
 */
public class WriteStringDemo {
public static void main(String[] args) throws IOException {
	RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
	String line ="����~��~";
	/*
	 * getBytes("UTF-8");
	 * ���ַ���ת��Ϊ�ֽڿ���ʹ��String�ṩ�ķ���
	 * byte[] getBytes()
	 * ����ϵͳĬ�ϵ��ַ���ת��Ϊ�ֽڣ����Ƽ���
	 * byte[] getByte(String csn)
	 * ���ո������ַ������ַ���תΪΪ�ֽ�
	 * �����ַ���
	 * UTF-8��unicode�ı��룬Ҳ��Ϊ����룬����Ӣ��1�ֽڣ�����3�ֽ�
	 * GBK��������룬Ӣ��1�ֽڣ�����2�ֽ�
	 * ISO8859-1:ŷ�޵ı��뼯����֧�����ģ�
	 * �ַ������Ʋ����ִ�Сд
	 * 
	 */
	byte[]data=line.getBytes("UTF-8");
	raf.write(data);
	raf.write("��һ����������λ��λ".getBytes("UTF-8"));
	System.out.println("д�����");
	raf.close();
}
}
