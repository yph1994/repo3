package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5之后推出了另一个特性：泛型
 * 泛型是用来在使用一个类时指定它的属性，方法参数和返回值类型的
 * 这可以提高代码的灵活度
 * 泛型最常用的地方就是集合中，用来使用集合时规定集合中的元素类型
 * @author Administrator
 *
 */
public class CollectionDemo7 {
public static void main(String[] args) {
	Collection<String>c=new ArrayList<String>();
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
//	c.add(1);编译不通过
	/*
	 * 集合指定了泛型后，新循环遍历时可以直接用
	 * 泛型的实际类型接受元素了。
	 */
	for (String string : c) {
	System.out.println(string);
	/*
	 * 迭代器也支持泛型，指定的与集合一致即可	
	 */
	}
	Iterator<String> it=c.iterator();
	while(it.hasNext()){
		String string =it.next();
		System.out.println(string);
	}
}
}
