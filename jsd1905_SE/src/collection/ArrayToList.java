package collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CosNaming.IstringHelper;

/**
 * 数组转化为集合
 * 数组的工具类：Arrays提供了一个静态方法asList
 * 可以将给定的数组转化为List集合
 */
public class ArrayToList {
public static void main(String[] args) {
	String [] array ={"one","two","three","four"};
	List<String>list=Arrays.asList(array);
	System.out.println(list.size());
	System.out.println(list);
	/*
	 * 从数组转换的集合，对该集合的操作就是对原数组的操作
	 */
	list.set(1, "2");
	System.out.println(list);
	System.out.println(Arrays.toString(array));
	System.out.println(list.size());
	/*
	 * 由于数组是定长的，因此从数组转换来的集合是
	 * 不能增删元素的，否则会抛出不支持该操作的异常
	 */
//	list.add("five");
	/*
	 * 若想对集合元素删增，需要自行创建一个集合
	 * z注：
	 * 所有集合都支持一个参数为Collection的构造方法
	 * 作用是创建当前集合的同时包含给定集合中的所有元素
	 */
	List<String>list2=new ArrayList<String>(list);
	System.out.println("list2："+list2);
	list2.add("five");
	System.out.println("list2："+list2);


	
}
}
