package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean remove (Object o)
 * ������Ԫ�شӼ�����ɾ��
 * @author Administrator
 *
 */
public class CollectionDemo3 {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add(new Point(1, 2));
	c.add(new Point(3, 4));
	c.add(new Point(5, 6));
	c.add(new Point(7, 8));
	c.add(new Point(9, 0));
	c.add(new Point(1, 2));
	Point p =new  Point(1, 2);
	c.remove(p);
	/*
	 * remove ������ɾ��Ԫ��ʱҲ�ǽ������������Ԫ��equals�Ƚ�Ϊtrue��ɾ����
	 * ע�⣺����List���϶��ԣ��������ظ���Ԫ�أ���ɾ��һ��
	 */
	System.out.println(c);
}
}
