package io;

import java.io.Serializable;
import java.util.Arrays;

/*
 * 使用当前类测试对象流的对象读写操作
 * 当前类实例若希望被对象流读写，那么当前类必须
 * 实现接口：java.io.Serializable
 */
public class Person implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/**
	 * 
	 */

private String name;
private int age;
private String gender;
/*
 * 一个类的实例在序列化时可以忽略不必要的属性
 * 来减少字节量从而降低资源开销
 * transient关键字只有序列化时有效，不会对
 * 属性有其他影响。
 */
private  transient String[] otherInfo;
public Person(String name, int age, String gender, String[] otherInfo) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
	this.otherInfo = otherInfo;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String[] getOtherInfo() {
	return otherInfo;
}
public void setOtherInfo(String[] otherInfo) {
	this.otherInfo = otherInfo;
}
 public String toString(){
	 return name+","+age+","+gender+","+Arrays.toString(otherInfo);
 }
}
