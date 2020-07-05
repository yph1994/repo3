package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue���нṹ
 * �����Ǿ�������ݽṹ֮һ�����Ա���һ��Ԫ�أ����Ǵ�ȡԪ�ر���
 * ��ѭ�Ƚ��ȳ�ԭ��
 * Queue�̳���Collection����˼��϶������ط��������߱�
 * ����ʵ���ࣺjava.util.LinkedList
 * @author Administrator
 *
 */
public class QueueDemo {
public static void main(String[] args) {
	/*
	 * LinkedList��������ṹʵ�ֵģ��ص�����ɾЧ�ʺã���������β��ɾԪ��
	 * Ч����á����ҿ��Ա���һ��Ԫ��
	 * ���е�Ӧ��LinkedList�ص����ö����㣬���LinkedListʵ���˶��нӿ�
	 */
	Queue<String> queue=new LinkedList<>();
	/*
	 * ��Ӳ�������Ԫ����ӵ���ĩβ
	 */
	queue.offer("one");
	queue.offer("two");
	queue.offer("three");
	queue.offer("four");
	queue.offer("five");
	System.out.println(queue);
	int size=queue.size();
	System.out.println("size"+size);
	/*
	 * E poll()
	 * ���Ӳ�������ȡ����Ԫ�ص�ͬʱ����Ԫ�شӶ�����ɾ��
	 */
	String str= queue.poll();
	System.out.println(str);
	System.out.println(queue);
	/*
	 * E peek()
	 * ���ö���Ԫ�أ���ȡ���Ԫ�ز��ᱻɾ��
	 */
     str= queue.peek();
     System.out.println(str);
     System.out.println(queue);
      /*
       * ʹ����ѭ��������������������Ԫ�أ�������Ԫ�ػ��ڶ�����
       */
     for (String string : queue) {
		System.out.println(string);
	}
     System.out.println(queue);
    /*
     * ʹ��poll������������ 
     */
//    while(queue.size()>0) {
     while(!queue.isEmpty()) {
     str= queue.poll();
    System.out.println(str);
	}
    System.out.println(queue);
	}
}
