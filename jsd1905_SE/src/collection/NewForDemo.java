package collection;
/**
 * JDK5֮���Ƴ���һ�����ԣ���ǿ��Forѭ��
 * Ҳ��Ϊ��ѭ����for each
 * ��ѭ����ȡ����ͳForѭ���Ĺ��������������������ϻ�����ʹ��
 * ������ѭ�����﷨�Ǳ������Ͽɵģ�����������Ͽɵġ�
 * @author Administrator
 *
 */
public class NewForDemo {
public static void main(String[] args) {
	String [] array ={"one","two","three","four","five"};
	for (int i = 0; i <array.length; i++) {
		String  str= array[i];
		System.out.println(str);
	}
	/*
	 *��ѭ���ᱻ�������ڱ���ʱ��Ϊ��ͨ��forѭ������
	 */
	for(String str:array){
		System.out.println(str);
	}
}
}
