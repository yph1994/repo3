package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove (Object o)
 * 将给定元素从集合中删除
 * @author Administrator
 *
 */
public class CollectionDemo3 {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add(new Point(1, 2));
	c.add(new Point(3, 4));
	c.add(new Point(5, 6));
	c.add(new Point(7, 8));
	c.add(new Point(9, 0));
	c.add(new Point(1, 2));
	Point p =new  Point(1, 2);
	c.remove(p);
	/*
	 * remove 方法在删除元素时也是将集合中与给定元素equals比较为true的删除，
	 * 注意：对于List集合而言，若存在重复的元素，仅删除一个
	 */
	System.out.println(c);
}
}
