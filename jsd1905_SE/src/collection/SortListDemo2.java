package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.LineListener;

/**
 * 排序自定义类型元素
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
		 * Collections的sort方法：
		 * static void sort(List list)
		 * 在排序时有一个要求，集合必须实现了接口Comparable，否则编译不通过。
		 */
		/*
		 * 重载的sort方法要求在额外传入一个比较器
		 * 并且该方法不再要求元素必须实现Comparable接口
		 * 而比较器可以通过匿名内部类创建，因此该方式排序
		 * 自定义类型元素时没有侵入性
		 */
		Collections.sort(list,new Comparator<Point>() {
			/*
			 *该方法用来定义o1和o2的大小关系的
			 *返回值为比较结果，不关注具体数值，只关注取值范围；
			 *当返回值>0时，表示o1>o2 
			 *当返回值=0时，表示o1=o2 
			 *当返回值<0时，表示o1<o2 
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

