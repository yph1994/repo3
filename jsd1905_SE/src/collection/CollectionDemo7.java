package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5֮���Ƴ�����һ�����ԣ�����
 * ������������ʹ��һ����ʱָ���������ԣ����������ͷ���ֵ���͵�
 * �������ߴ��������
 * ������õĵط����Ǽ����У�����ʹ�ü���ʱ�涨�����е�Ԫ������
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
//	c.add(1);���벻ͨ��
	/*
	 * ����ָ���˷��ͺ���ѭ������ʱ����ֱ����
	 * ���͵�ʵ�����ͽ���Ԫ���ˡ�
	 */
	for (String string : c) {
	System.out.println(string);
	/*
	 * ������Ҳ֧�ַ��ͣ�ָ�����뼯��һ�¼���	
	 */
	}
	Iterator<String> it=c.iterator();
	while(it.hasNext()){
		String string =it.next();
		System.out.println(string);
	}
}
}
