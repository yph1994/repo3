package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java集合框架
 * java.util.Collection接口，该接口是集合的顶级接口，
 * 所有集合实现类都实现了该接口。它里面定义了所有集合都必须具备的功能
 * 
 * Collection下面有两个常见的子接口：
 * java.util.List:可重复集合，且有序
 * java.util.Set:不可重复集合，大部分实现类无序
 * 
 * 集合也可以保存一组元素，并且提供了对元素的相关操作方法，使用起来比数组更便捷，
 * 并且有多种不同的数据结构，可集合实际开发需求选取。
 * @author Administrator
 *
 */
public class CollectionDemo1 {
public static void main(String[] args) {
	Collection c = new  ArrayList();
	/*
	 * boolean add(E e)
	 * 向集合中添加元素，成功添加后返回true
	 */
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
	c.add("five");
	System.out.println(c);
	int size=c.size();
	System.out.println("size:"+size);
	boolean isEmpty=c.isEmpty();
	System.out.println(isEmpty);
	/*
	 * void clear ()
	 * 清空
	 */
	c.clear();
	System.out.println("集合已清空");
	System.out.println("size:"+size);
	System.out.println(isEmpty);
	System.out.println(c);
}
}
