package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * ����ת��Ϊ����
 * Collection�ṩ�˽�����ת��Ϊ����ķ�����toArray
 * @author Administrator
 *
 */
public class CollectionToArrayDemo {
public static void main(String[] args) {
	Collection <String>c=new ArrayList<String>();
	c.add("one");
	c.add("two");
	c.add("three");
	c.add("four");
	
	
//    Object  []array=c.toArray();
	/*
	 * toArray����Ҫ����һ�����飬�����������ã�����>=����size��
	 * �򽫼���Ԫ�ش��벢���ظ����顣�������û����д���һ���뼯��
	 * sizeһ�µ����鲢���ء�
	 */
	String [] array=c.toArray(new String [c.size()]);
	System.out.println(array.length);
	System.out.println(Arrays.toString(array));
	
	
	
}
}
