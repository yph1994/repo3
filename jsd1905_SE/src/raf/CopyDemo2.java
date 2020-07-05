package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ͨ�����ÿ�ζ�д��������������ʵ�ʶ�д������
 * ������߶�дЧ�ʵ�
 * 
 * ���ֽڶ�дһ��Ҳ��Ϊ�����д��ʽ
 * һ���ֽ�һ���ֽڵĶ�дһ��Ҳ��Ϊ���д��ʽ
 * 
 * ���ڻ�еӲ�̶��ԣ����д��Ч���ǲ����
 * 
 * @author Administrator
 *
 */
public class CopyDemo2 {
public static void main(String[] args) throws IOException {
	RandomAccessFile src= new RandomAccessFile("tts9.zip","r");
	RandomAccessFile desc= new RandomAccessFile("tts9_cp.zip","rw");
	/*
	 * int read(byte[]data)
	 * һ���Զ�ȡ�����ֽ������ܳ��ȵ��ֽ�������
	 * ���뵽�����飬����ֵΪʵ�ʶ�ȡ�����ֽ�����������ֵ
	 * Ϊ-1���ʾ�ļ�ĩβ
	 */
	/*
	 * void write (byte[]data)
	 * һ���Խ������ֽ������������ֽ�д��
	 * void write(byte[]data,int offset,int len)
	 * ���������ֽ����� ���±�offset��������len���ֽ�
	 * һ����д��
	 */
	int len =1;//��¼ÿ��ʵ�ʶ�ȡ���ֽ���
	byte [] data=new byte [1024*10];
	long start=System.currentTimeMillis();
	while((len=src.read(data))!=-1){
		desc.write(data, 0, len);
	}
	long end=System.currentTimeMillis();
	System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
	src.close();
	desc.close();
}
}
