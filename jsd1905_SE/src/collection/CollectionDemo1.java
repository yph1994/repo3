package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java���Ͽ��
 * java.util.Collection�ӿڣ��ýӿ��Ǽ��ϵĶ����ӿڣ�
 * ���м���ʵ���඼ʵ���˸ýӿڡ������涨�������м��϶�����߱��Ĺ���
 * 
 * Collection�����������������ӽӿڣ�
 * java.util.List:���ظ����ϣ�������
 * java.util.Set:�����ظ����ϣ��󲿷�ʵ��������
 * 
 * ����Ҳ���Ա���һ��Ԫ�أ������ṩ�˶�Ԫ�ص���ز���������ʹ���������������ݣ�
 * �����ж��ֲ�ͬ�����ݽṹ���ɼ���ʵ�ʿ�������ѡȡ��
 * @author Administrator
 *
 */
public class CollectionDemo1 {
public static void main(String[] args) {
	Collection c = new  ArrayList();
	/*
	 * boolean add(E e)
	 * �򼯺������Ԫ�أ��ɹ���Ӻ󷵻�true
	 */
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
	c.add("five");
	System.out.println(c);
	int size=c.size();
	System.out.println("size:"+size);
	boolean isEmpty=c.isEmpty();
	System.out.println(isEmpty);
	/*
	 * void clear ()
	 * ���
	 */
	c.clear();
	System.out.println("���������");
	System.out.println("size:"+size);
	System.out.println(isEmpty);
	System.out.println(c);
}
}
