package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע�Ṧ��
 * ����������Ҫ���û����룺�û��������룬�ǳƣ�����
 * Ȼ�󽫸ü�¼д���ļ�user.dat�б���
 * @author Administrator
 *���У��û��������룬�ǳ�Ϊ�ַ�����
 *     ����Ϊintֵ
 *     ÿ����¼ռ��100�ֽڣ������û��������룬�ǳƸ�ռ
 *     32�ֽڣ�ʵ�����ݲ����Ĳ��䵽32�ֽڣ�������Ϊ�̶���
 *     4�ֽ�
 */
public class RegDemo {
public static void main(String[] args) throws IOException {
	Scanner sc =new Scanner(System.in);
	System.out.println("��ӭע��");
	System.out.println("�������û���");
	String username=sc.nextLine();
	System.out.println("����������");
	String password=sc.nextLine();
	System.out.println("�������ǳ�");
	String nickname=sc.nextLine();
	System.out.println("����������");
	int age=Integer.parseInt(sc.nextLine());
	RandomAccessFile raf=new RandomAccessFile("user.dat","rw");
	//�ֽ�ָ���ƶ����ļ�ĩβ���Ա�׷���¼�¼
	raf.seek(raf.length());
	byte []data=username.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	data=password.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	data=nickname.getBytes("utf-8");
	data=Arrays.copyOf(data, 32);
	raf.write(data);
	
	raf.writeInt(age);
	System.out.println("ע�����");
	raf.close();
	
}
}
