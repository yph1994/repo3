package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * java.util.Deque
 *˫�˶��нӿ�
 *Deque�̳���Queue�ӿڣ�˫�˶��е��ص������˶��ǿ���������Ӳ���
 *����ʵ���ࣺjava.util.LinkedList
 * @author Administrator
 *
 */
public class DequeDemo {
public static void main(String[] args) {
	Deque<String>deque=new LinkedList<>();
	deque.offer("one");
	deque.offer("two");
	System.out.println(deque);
	deque.offerFirst("three");//���׷������
	System.out.println(deque);
	deque.offerLast("four");//��β������ӣ���offerһ�£�
	System.out.println(deque);    
	/*
	 * ����
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
