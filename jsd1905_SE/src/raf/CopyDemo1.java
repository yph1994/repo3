package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ʹ��RAF����ļ����Ʋ���
 * @author Administrator
 *
 */
public class CopyDemo1 {
public static void main(String[] args) throws IOException {
	/*
	 * ����һ��RAF��ȡԴ�ļ�
	 * ����һ��RAF����д�����ļ�
	 * ѭ����Դ�ļ��ж�ȡÿһ���ֽڲ�д�뵽�����ļ���
	 * �ر�����RAF
	 */
	RandomAccessFile src =new RandomAccessFile("airplane0.png","r");
	RandomAccessFile copy= new RandomAccessFile("airplanecopy.png","rw");
	int d=-1;
	long start=System.currentTimeMillis();
	while((d=src.read())!=-1){
		copy.write(d);
	}
	long end=System.currentTimeMillis();
	System.out.println("�������!��ʱ:"+(end-start)+"ms");
	src.close();
	copy.close();
}
}
