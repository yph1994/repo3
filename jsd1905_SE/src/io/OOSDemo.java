package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectInputStream
 * java.io.ObjcetOutputStream
 * @author Administrator
 *对象流是一对高级流，作用是进行对象序列化与反序列化
 *即：将一个java对象转化为一组字节或反向操作
 *在流连接中使用他们可以方便的读写java对象。
 */
public class OOSDemo {
public static void main(String[] args) throws IOException {
	/*
	 * 将一个Person实例写入文件person.obj中
	 */
	String name="苍老师";
	String gender="女";
	int age=18;
	String [] otherInfo = {"是个演员","德艺双馨","已婚","爱好写大字","促进中日文化交流","广大男性的启蒙老师"};
    Person p = new Person(name,age,gender,otherInfo);
    System.out.println(p);
    		
    FileOutputStream fos = new FileOutputStream("person.obj");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(p);
    System.out.println("写出完毕！");
    oos.close();
}

}
