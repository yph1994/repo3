package collection;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.CosNaming.IstringHelper;

/**
 * ����ת��Ϊ����
 * ����Ĺ����ࣺArrays�ṩ��һ����̬����asList
 * ���Խ�����������ת��ΪList����
 */
public class ArrayToList {
public static void main(String[] args) {
	String [] array ={"one","two","three","four"};
	List<String>list=Arrays.asList(array);
	System.out.println(list.size());
	System.out.println(list);
	/*
	 * ������ת���ļ��ϣ��Ըü��ϵĲ������Ƕ�ԭ����Ĳ���
	 */
	list.set(1, "2");
	System.out.println(list);
	System.out.println(Arrays.toString(array));
	System.out.println(list.size());
	/*
	 * ���������Ƕ����ģ���˴�����ת�����ļ�����
	 * ������ɾԪ�صģ�������׳���֧�ָò������쳣
	 */
//	list.add("five");
	/*
	 * ����Լ���Ԫ��ɾ������Ҫ���д���һ������
	 * zע��
	 * ���м��϶�֧��һ������ΪCollection�Ĺ��췽��
	 * �����Ǵ�����ǰ���ϵ�ͬʱ�������������е�����Ԫ��
	 */
	List<String>list2=new ArrayList<String>(list);
	System.out.println("list2��"+list2);
	list2.add("five");
	System.out.println("list2��"+list2);


	
}
}
