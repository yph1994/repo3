package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输入流，用于进行对象的反序列化
 * @author Administrator
 *
 */
public class OISDemo {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	//负责从文件中读取字节5
	FileInputStream fis=new FileInputStream("person.obj");
	//负责将字节按照其结构还原为java对象
	ObjectInputStream ois =new ObjectInputStream(fis);
	Person p =(Person)ois.readObject();
	System.out.println(p);
	ois.close();
}
}
