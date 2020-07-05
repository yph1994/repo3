package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque
 *双端队列接口
 *Deque继承自Queue接口，双端队列的特点是两端都是可以做出入队操作
 *常用实现类：java.util.LinkedList
 * @author Administrator
 *
 */
public class DequeDemo {
public static void main(String[] args) {
	Deque<String>deque=new LinkedList<>();
	deque.offer("one");
	deque.offer("two");
	System.out.println(deque);
	deque.offerFirst("three");//队首方向入队
	System.out.println(deque);
	deque.offerLast("four");//队尾方向入队（与offer一致）
	System.out.println(deque);    
	/*
	 * 出队
	 */
	String str=deque.poll();
	System.out.println(str);
	System.out.println(deque);
    str=deque.pollFirst();
    System.out.println(str);
    System.out.println(deque);
	str=deque.pollLast();
	System.out.println(str);
	System.out.println(deque);
	
}
}
