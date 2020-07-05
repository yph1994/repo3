package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection提供了一个用于遍历集合元素的方法：
 * Iterator iterator（）
 * 该方法会获取一个用于遍历当前集合的迭代器
 * java.util.Itertor接口
 * 迭代器接口：不同集合都实现了一个迭代器的实现类但是
 * 我们无需记住他们，只当他们是迭代器Itertor看待即可，该接口
 * 定义了用于遍历集合的相关方法
 * 而遍历集合遵循的步骤为：问，取，删
 * 其中删除元素不是遍历过程中的必要操作
 * @author Administrator
 *
 */
public class CollectionDemo6 {
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add("one");
	c.add("#");
	c.add("two");
	c.add("#");
	c.add("three");
	c.add("#");
	c.add("four");
	c.add("#");
	c.add("five");

	System.out.println(c);
	/*
	 * boolean hasNext();
	 * 判断是否集合中还有下一个元素可以遍历
	 * E next()
	 * 获取集合下一个元素
	 */
	Iterator it= c.iterator();
	while(it.hasNext()){
		String str = (String)it.next();
		System.out.println(str);
		if("#".equals(str)){
			/*
			 * 迭代器有一个要求，就是遍历的过程中不得通过集合的方法
			 * 增删元素，否则遍历会出现异常。
			 * c.remove(str);
			 */
			 /* 
			  * 迭代器已提供了remove方法，删除的是通过next方法得到的元素
			 */
			it.remove();
		}
	}
	System.out.println(c);
}
}
