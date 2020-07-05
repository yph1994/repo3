package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * 判断是否包含给定元素
 * @author Administrator
 *
 */
public class CollectionDemo2 {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add(new Point(1, 2));
	c.add(new Point(3, 4));
	c.add(new Point(5, 6));
	c.add(new Point(7, 8));
	c.add(new Point(9, 0));
	Point p =new  Point(1, 2);
	/*
	 * contains 方法判断元素是否被包含的标准是跟据给定元素与
	 * 集合现有元素顺序equals比较，若有比较结果为true的就认为
	 * 包含，因此集合元素equals方法直接影响比较结果
	 */
	boolean contains= c.contains(p);
	System.out.println("包含："+contains);
	
	
	
}
}
