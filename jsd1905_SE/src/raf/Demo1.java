package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * ����ָ����ļ����ݽ��������д
 * ����RAFʱ�����ֳ����Ĵ���ģʽ��
 * 1.ֻ��ģʽ��r�������ܶ�ȡ�ļ����ݣ�������д����
 * 2.��дģʽ��rw�������ļ����ݿɽ��ж�д����
 * @author Administrator
 *
 */
public class Demo1 {
public static void main(String[] args) throws IOException {
	/*
	 * ������RAF���췽��
	 * RandomAccessFile(String path ,String mode)
	 * RandomAccessFile(File file ,String mode)
	 * ��һ������ΪҪ�������ļ���
	 * �ڶ�������Ϊģʽ��֧�ֵ��ַ������õ�Ϊ��
	 * ��r����ֻ��          ��rw������д
	 */
	//�Ե�ǰĿ¼�� ��raf.dat�ļ���д����
	RandomAccessFile raf= new RandomAccessFile("raf.dat","rw");
	/*
	 * void write (int d)
	 * ���ļ���д��1���ֽڣ�д����Ǹ�����intֵ
	 * ����Ӧ��2���Ƶġ���8λ��
	 */
	raf.write(257);
	raf.write(1);
	System.out.println("д�����");
	raf.close();
}
}
