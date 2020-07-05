package collection;


import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List���Ա�
 * List���Ͽ��Դ���ظ�Ԫ�أ�������������List�ӿ����ṩ��һ��
 * ����ͨ���±����Ԫ�صķ���
 * ����ʵ���ࣺ
 * java.util.ArrayList:ʹ������ʵ�ֵ�List
 * java.util.LinkedList:ʹ������ʵ�ֵ�List
 * @author Administrator
 *
 *ArrayList����������ʵ�֣���ѯ���ܸ��ã�������ɾ
 *Ԫ�����ܲ�
 *LinkedList������ʵ�֣���ɾԪ�����ܺ�������β��ɾԪ�أ����ǲ�ѯ
 *�ٶ�ƫ��
 *������Ҫ�����ر����Ҫ��������ͨ��ʹ��ArrayList
 */
public class ListDemo {
public static void main(String[] args) {
	List <String> list=new ArrayList<>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	list.add("five");
	System.out.println(list);
	/*
	 * E get(int index)
	 * ��ȡָ���±��Ӧ��Ԫ��
	 */
	String string=list.get(2);
	System.out.println(string);
	/*
	 * ��ͨforѭ�����Ա���List����
	 */
	for (int i = 0; i <list.size(); i++) {
		String s =list.get(i);
		System.out.println(s );
	}
	/*
	 * E set (int index, E e)
	 * ������Ԫ�����õ�ָ��Ϊλ���ϣ�����ֵΪ
	 * ԭλ�ö�ӦԪ��
	 * ����set�������滻Ԫ�ز���
	 * 
	 */
	String old=list.set(1, "2");
	System.out.println(list);
	System.out.println("old:"+old);
	/*
	 * �������¼��ϵ�ǰ���½����ϵ���
	 */
	for (int i = 0; i <list.size()/2; i++) {
		//��ȡ����λ�ĵ�Ԫ��
//		String s=list.get(i);
		//������λ��Ԫ�����õ�����λ�ò���ȡԭ����λ��Ԫ��
//		s=list.set(list.size()-1-i, s);
		//������λ��Ԫ�����õ�����λ����ɽ���
//		list.set(i, s);
		list.set(i,list.set(list.size()-1-i, list.get(i)));
	}
	System.out.println(list);
}
}
