package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合支持获取子集操作
 * List subList（int start， int end）
 * 获取指定范围内的子集
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
	 * 将子集元素扩大10倍
	 */
	for (int i = 0; i < sublist.size(); i++) {
		sublist.set(i, sublist.get(i)*10);
	}
	System.out.println(sublist);
	/*
	 * 对子集的操作就是对原集合对应元素的操作
	 */
	System.out.println(list);
    /*
     * 清除list集合2-8的元素
     */
	list.subList(2,9).clear();
	System.out.println(list);
}
}
