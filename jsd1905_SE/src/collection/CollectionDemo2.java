package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * boolean contains(Object o)
 * �ж��Ƿ��������Ԫ��
 * @author Administrator
 *
 */
public class CollectionDemo2 {
public static void main(String[] args) {
	Collection c= new ArrayList();
	c.add(new Point(1, 2));
	c.add(new Point(3, 4));
	c.add(new Point(5, 6));
	c.add(new Point(7, 8));
	c.add(new Point(9, 0));
	Point p =new  Point(1, 2);
	/*
	 * contains �����ж�Ԫ���Ƿ񱻰����ı�׼�Ǹ��ݸ���Ԫ����
	 * ��������Ԫ��˳��equals�Ƚϣ����бȽϽ��Ϊtrue�ľ���Ϊ
	 * ��������˼���Ԫ��equals����ֱ��Ӱ��ȽϽ��
	 */
	boolean contains= c.contains(p);
	System.out.println("������"+contains);
	
	
	
}
}
