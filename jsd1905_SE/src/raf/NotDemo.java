package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * ��ϰ�����һ�����׼��±�����
 * ����������Ҫ���û�����̨�����ļ�����Ȼ��ͨ��RAF�򿪸��ļ�
 * ֮���û��ڿ���̨�����ÿ���ַ�����д�뵽����ļ���
 * ���û��������롰exit�������˳�
 * 
 * ע��������ļ����ݲ����ǻ���
 * @author Administrator
 *
 */
public class NotDemo {
	public static void main(String[] args) throws UnsupportedEncodingException, IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������ļ���");
		String  name= sc.next();
		File file= new File(name);
		RandomAccessFile raf= new RandomAccessFile(name,"rw");
		System.out.println("����������,����exit����");

		while(true){
			String txt=sc.next();
			if("exit".equals(txt)){//�ַ�������equals�ַ������Ա����ָ���쳣
				break;}
				raf.write(txt.getBytes("UTF-8"));
		System.out.println("����");}
		raf.close();
	
	}
}
