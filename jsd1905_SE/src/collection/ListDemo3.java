package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List����֧�ֻ�ȡ�Ӽ�����
 * List subList��int start�� int end��
 * ��ȡָ����Χ�ڵ��Ӽ�
 * @author Administrator
 *
 */
public class ListDemo3 {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
		list.add(i);
		
	}
	System.out.println(list);
	List<Integer>sublist= list.subList(3, 8);
	System.out.println(sublist);
	/*
	 * ���Ӽ�Ԫ������10��
	 */
	for (int i = 0; i < sublist.size(); i++) {
		sublist.set(i, sublist.get(i)*10);
	}
	System.out.println(sublist);
	/*
	 * ���Ӽ��Ĳ������Ƕ�ԭ���϶�ӦԪ�صĲ���
	 */
	System.out.println(list);
    /*
     * ���list����2-8��Ԫ��
     */
	list.subList(2,9).clear();
	System.out.println(list);
}
}
