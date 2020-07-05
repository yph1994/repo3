package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 新循环遍历集合
 * @author Administrator
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * 编译器会将使用新循环遍历集合改为使用
		 * 迭代器遍历，因此不要在遍历的过程中通过
		 * 集合的方法增删元素。
		 */
		for(Object  o:c){
			String str= (String)o;
			System.out.println(str);
		}
	}
}
