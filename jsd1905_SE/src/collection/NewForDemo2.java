package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ��ѭ����������
 * @author Administrator
 *
 */
public class NewForDemo2 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		/*
		 * �������Ὣʹ����ѭ���������ϸ�Ϊʹ��
		 * ��������������˲�Ҫ�ڱ����Ĺ�����ͨ��
		 * ���ϵķ�����ɾԪ�ء�
		 */
		for(Object  o:c){
			String str= (String)o;
			System.out.println(str);
		}
	}
}
