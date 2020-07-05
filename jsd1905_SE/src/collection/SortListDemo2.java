package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.LineListener;

/**
 * �����Զ�������Ԫ��
 * @author Administrator
 *
 */
public class SortListDemo2 {
	public static void main(String[] args) {
		/*
		 * Comparale
		 */
		List<Point>list=new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(9,8));
		list.add(new Point(7,6));
		list.add(new Point(3,4));
		list.add(new Point(2,5));
		System.out.println(list);

//		Collections.sort(list);
		/*
		 * Collections��sort������
		 * static void sort(List list)
		 * ������ʱ��һ��Ҫ�󣬼��ϱ���ʵ���˽ӿ�Comparable��������벻ͨ����
		 */
		/*
		 * ���ص�sort����Ҫ���ڶ��⴫��һ���Ƚ���
		 * ���Ҹ÷�������Ҫ��Ԫ�ر���ʵ��Comparable�ӿ�
		 * ���Ƚ�������ͨ�������ڲ��ഴ������˸÷�ʽ����
		 * �Զ�������Ԫ��ʱû��������
		 */
		Collections.sort(list,new Comparator<Point>() {
			/*
			 *�÷�����������o1��o2�Ĵ�С��ϵ��
			 *����ֵΪ�ȽϽ��������ע������ֵ��ֻ��עȡֵ��Χ��
			 *������ֵ>0ʱ����ʾo1>o2 
			 *������ֵ=0ʱ����ʾo1=o2 
			 *������ֵ<0ʱ����ʾo1<o2 
			 */
		
			public int compare(Point o1, Point o2) {
			int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
			int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
				return len1-len2;
			}
		});
		System.out.println(list);
	}
}

