package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue队列结构
 * 队列是经典的数据结构之一，可以保存一组元素，但是存取元素必须
 * 遵循先进先出原则
 * Queue继承自Collection，因此集合定义的相关方法它都具备
 * 常用实现类：java.util.LinkedList
 * @author Administrator
 *
 */
public class QueueDemo {
public static void main(String[] args) {
	/*
	 * LinkedList是由链表结构实现的，特点是增删效率好，尤其是首尾增删元素
	 * 效率最好。并且可以保存一组元素
	 * 队列的应用LinkedList特点正好都满足，因此LinkedList实现了队列接口
	 */
	Queue<String> queue=new LinkedList<>();
	/*
	 * 入队操作，将元素添加到队末尾
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
	 * 出队操作，获取队首元素的同时将该元素从队列中删除
	 */
	String str= queue.poll();
	System.out.println(str);
	System.out.println(queue);
	/*
	 * E peek()
	 * 引用队首元素，获取后该元素不会被删除
	 */
     str= queue.peek();
     System.out.println(str);
     System.out.println(queue);
      /*
       * 使用新循环（迭代器）遍历队列元素，遍历后元素还在队列中
       */
     for (String string : queue) {
		System.out.println(string);
	}
     System.out.println(queue);
    /*
     * 使用poll方法遍历队列 
     */
//    while(queue.size()>0) {
     while(!queue.isEmpty()) {
     str= queue.poll();
    System.out.println(str);
	}
    System.out.println(queue);
	}
}
