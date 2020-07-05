package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * ջ�ṹ
 * ջҲ�Ǿ�������ݽṹ֮һ�����Ա���һ��Ԫ�ء�
 * ��ȡԪ�ر�����ѭ�Ƚ������ԭ��
 * ͨ��ʹ��ջ����ɡ����ˡ���ǰ�����Ĺ���
 * ˫�˶��нӿڣ�Deque���ֻ���ô�ͬһ�����Ӳ������γ���ջ
 * �����Ϊջ�ṩ�˶�Ӧ�ķ�����push��pop
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
	 * ʹ��pop�������
	 */
	str=stack.peek();
	System.out.println(str);
	while(!stack.isEmpty()){
		System.out.println(stack.pop());
	}
	System.out.println(stack);
	
	
}
}
