package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java io
 * java  ��׼���������
 * java IO ʹ���ǿ��Ա�׼�Ķ�д����������豸
 * ���ж�д��д����
 * IO����д�ֳ���������
 * ��������java.io.InputStream�������ֽ����������̳�������
 * ���涨�˶�ȡ�ֽڵ���ط���������ζ�������ֽ������������и�
 * ������ʹ���ǿ���ʹ����ͬ�ķ������ò�ͬ���ֽ������ȡ��ͬ
 * �豸������
 * 
 * �������java.io.OutputStream,�����ֽ����������̳��������涨��
 * д���ֽڵ���ط���
 * 
 * java������Ϊ���֣�
 * �ڵ������ͼ�������ʵ�����ӳ���������Դ�ġ��ܵ���������ʵ�ʰ������ݵ���
 * ��д��һ���ǽ����ڽڵ����Ļ����Ͻ��е�
 * ���������߼��������ܶ������ڣ������������������ϣ�Ŀ���ǵ�����������ǰ
 * �߼���ʱ�����ݽ���ĳ�ּӹ����������Ƕ�д����ʱ����ӹ�����
 * ʵ������IOʱ������ͨ���ᴮ�����ɸ߼����������ӵ��ͼ����ϣ�ʹ�ö�д����
 * ����ˮ�ߵļӹ�����������̳�Ϊ���������ӡ�,��Ҳ��IO�ľ�������
 * 
 * 
 * �ļ���
 * java.io.FileOutputStream
 * java.io.FileInputStream 
 * �ļ�����һ�Եͼ�������������д�ļ����ݵ���
 * �ļ�����RAF������
 * �������Ƕ���������д�ļ����ݵģ�����RAF�ǻ���ָ��������д��
 * ��˿��Զ�д�ļ�������λ�ã���д��ʽ�����Ա༭�ļ��Ĳ�������
 * �ļ����ǻ���JAVA IO�ı�׼��д����IO��˳���д��ʽ������
 * ֻ��˳�������д���ǲ��ܻ��˵ģ�����ڶ�д��ʽ�ϲ���RAF�����ǻ���IO
 * �����Ӳ����������Դ����߼��������Ӷ�д�򵥻�������һ��RAF����������
 * 
 * @author Administrator
 *
 */
public class FOSdemo {
public static void main(String[] args) throws UnsupportedEncodingException, IOException {
	/*
	 * ���ļ�fos.txt��д���ַ���
	 */
	/*
	 * �ļ��������ִ�����ʽ:
	 * FileOutputStream(String path)
	 * FileOutputStream(File file)
	 * ������ʽ�������ļ����Ǹ���ģʽ��
	 * �������ļ��Ѿ����ڣ���ô�Ὣ���ļ�ԭ��
	 * ����ȫ��ɾ����Ȼ��ͨ����ǰ��д�������
	 * ��Ϊ�ļ����ݱ�����
	 * FileOutputStream(String path��boolean append)
	 * FileOutputStream(File file��boolean append)
	 * ������ʽ�������ļ���Ϊ׷��дģʽ��
	 * ���ļ��Ѿ����ڣ���ôԭ���ݶ�������ͨ��
	 * ��ǰ��д�������ݻᱻ׷�����ļ�ĩβ��
	 */
//	FileOutputStream fos =new FileOutputStream("fos.txt");
	FileOutputStream fos =new FileOutputStream("fos.txt",true);
	/*
	 * void write(byte[] data)
	 * ���ļ���д��һ���ֽ�
	 */
	fos.write("״̬����".getBytes("utf-8"));
	System.out.println("д�����");
	fos.close();
	
}
}
