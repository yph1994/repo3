package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List�ṩ��һ�����ص�add��remove����
 * @author Administrator
 *
 */
public class ListDemo2 {
public static void main(String[] args) {
	List <String> list=new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	System.out.println(list);
	/*
	 * void add(int index,E e)
	 * ������Ԫ�ز��뵽ָ��λ��
	 */
	list.add(2,"2");
	System.out.println(list);
	
	/*
	 * E remove(int index);
	 * ������λ�õ�Ԫ��ɾ��������
	 */
	String str=list.remove(2);
	System.out.println(list);
	System.out.println("old:"+str);
	
	
	
	
	
}

}
