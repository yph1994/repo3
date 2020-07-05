package collection;


import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List线性表
 * List集合可以存放重复元素，并且有序。所以List接口中提供了一套
 * 可以通过下标操作元素的方法
 * 常用实现类：
 * java.util.ArrayList:使用数组实现的List
 * java.util.LinkedList:使用链表实现的List
 * @author Administrator
 *
 *ArrayList由于是数组实现，查询性能更好，但是增删
 *元素性能差
 *LinkedList是链表实现，增删元素性能好尤其首尾增删元素，但是查询
 *速度偏慢
 *在性能要求不是特别苛刻要求的情况下通常使用ArrayList
 */
public class ListDemo {
public static void main(String[] args) {
	List <String> list=new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	System.out.println(list);
	/*
	 * E get(int index)
	 * 获取指定下标对应的元素
	 */
	String string=list.get(2);
	System.out.println(string);
	/*
	 * 普通for循环可以遍历List集合
	 */
	for (int i = 0; i <list.size(); i++) {
		String s =list.get(i);
		System.out.println(s );
	}
	/*
	 * E set (int index, E e)
	 * 将给定元素设置到指定为位置上，返回值为
	 * 原位置对应元素
	 * 所以set方法是替换元素操作
	 * 
	 */
	String old=list.set(1, "2");
	System.out.println(list);
	System.out.println("old:"+old);
	/*
	 * 不创建新集合的前提下将集合倒序
	 */
	for (int i = 0; i <list.size()/2; i++) {
		//获取正数位的的元素
//		String s=list.get(i);
		//将正数位置元素设置到倒数位置并获取原倒数位置元素
//		s=list.set(list.size()-1-i, s);
		//将倒数位置元素设置到正数位置完成交换
//		list.set(i, s);
		list.set(i,list.set(list.size()-1-i, list.get(i)));
	}
	System.out.println(list);
}
}
