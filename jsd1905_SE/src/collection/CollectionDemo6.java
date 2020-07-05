package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ���ϵı���
 * Collection�ṩ��һ�����ڱ�������Ԫ�صķ�����
 * Iterator iterator����
 * �÷������ȡһ�����ڱ�����ǰ���ϵĵ�����
 * java.util.Itertor�ӿ�
 * �������ӿڣ���ͬ���϶�ʵ����һ����������ʵ���൫��
 * ���������ס���ǣ�ֻ�������ǵ�����Itertor�������ɣ��ýӿ�
 * ���������ڱ������ϵ���ط���
 * ������������ѭ�Ĳ���Ϊ���ʣ�ȡ��ɾ
 * ����ɾ��Ԫ�ز��Ǳ��������еı�Ҫ����
 * @author Administrator
 *
 */
public class CollectionDemo6 {
public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add("one");
	c.add("#");
	c.add("two");
	c.add("#");
	c.add("three");
	c.add("#");
	c.add("four");
	c.add("#");
	c.add("five");

	System.out.println(c);
	/*
	 * boolean hasNext();
	 * �ж��Ƿ񼯺��л�����һ��Ԫ�ؿ��Ա���
	 * E next()
	 * ��ȡ������һ��Ԫ��
	 */
	Iterator it= c.iterator();
	while(it.hasNext()){
		String str = (String)it.next();
		System.out.println(str);
		if("#".equals(str)){
			/*
			 * ��������һ��Ҫ�󣬾��Ǳ����Ĺ����в���ͨ�����ϵķ���
			 * ��ɾԪ�أ��������������쳣��
			 * c.remove(str);
			 */
			 /* 
			  * ���������ṩ��remove������ɾ������ͨ��next�����õ���Ԫ��
			 */
			it.remove();
		}
	}
	System.out.println(c);
}
}
