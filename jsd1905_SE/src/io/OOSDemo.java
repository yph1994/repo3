package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * ������
 * java.io.ObjectInputStream
 * java.io.ObjcetOutputStream
 * @author Administrator
 *��������һ�Ը߼����������ǽ��ж������л��뷴���л�
 *������һ��java����ת��Ϊһ���ֽڻ������
 *����������ʹ�����ǿ��Է���Ķ�дjava����
 */
public class OOSDemo {
public static void main(String[] args) throws IOException {
	/*
	 * ��һ��Personʵ��д���ļ�person.obj��
	 */
	String name="����ʦ";
	String gender="Ů";
	int age=18;
	String [] otherInfo = {"�Ǹ���Ա","����˫ܰ","�ѻ�","����д����","�ٽ������Ļ�����","������Ե�������ʦ"};
    Person p = new Person(name,age,gender,otherInfo);
    System.out.println(p);
    		
    FileOutputStream fos = new FileOutputStream("person.obj");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(p);
    System.out.println("д����ϣ�");
    oos.close();
}

}
