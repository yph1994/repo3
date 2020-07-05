package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转化为数组
 * Collection提供了将集合转化为数组的方法：toArray
 * @author Administrator
 *
 */
public class CollectionToArrayDemo {
public static void main(String[] args) {
	Collection <String>c=new ArrayList<String>();
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
	
	
//    Object  []array=c.toArray();
	/*
	 * toArray方法要求传入一个数组，如果该数组可用（长度>=集合size）
	 * 则将集合元素存入并返回该数组。若不可用会自行创建一个与集合
	 * size一致的数组并返回。
	 */
	String [] array=c.toArray(new String [c.size()]);
	System.out.println(array.length);
	System.out.println(Arrays.toString(array));
	
	
	
}
}
