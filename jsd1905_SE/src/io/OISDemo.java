package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * ���������������ڽ��ж���ķ����л�
 * @author Administrator
 *
 */
public class OISDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//������ļ��ж�ȡ�ֽ�5
	FileInputStream fis=new FileInputStream("person.obj");
	//�����ֽڰ�����ṹ��ԭΪjava����
	ObjectInputStream ois =new ObjectInputStream(fis);
	Person p =(Person)ois.readObject();
	System.out.println(p);
	ois.close();
}
}
