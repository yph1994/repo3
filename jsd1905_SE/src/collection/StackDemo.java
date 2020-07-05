package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 栈结构
 * 栈也是经典的数据结构之一，可以保存一组元素。
 * 存取元素必须遵循先进后出的原则。
 * 通常使用栈来完成“后退”“前进”的功能
 * 双端队列接口：Deque如果只调用从同一侧出入队操作就形成了栈
 * 因此其为栈提供了对应的方法：push，pop
 */
public class StackDemo {
public static void main(String[] args) {
	Deque<String> stack = new LinkedList<String>();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	stack.push("four");
	System.out.println(stack);
	String str= stack.pop();
	System.out.println(str);
	System.out.println(stack);
	/*
	 * 使用pop遍历输出
	 */
	str=stack.peek();
	System.out.println(str);
	while(!stack.isEmpty()){
		System.out.println(stack.pop());
	}
	System.out.println(stack);
	
	
}
}
