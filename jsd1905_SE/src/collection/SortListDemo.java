package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * java.util.Collections���ϵĹ�����
 * �����ṩ�˺ܶྲ̬�������ڲ������ϣ�������һ������
 * sort��������list���Ͻ�����Ȼ�����(��С����)
 */
public class SortListDemo {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	Random ran =new Random();
	for (int i = 0; i <10; i++) {
		list.add(ran.nextInt(100));
	}
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
}	
}
