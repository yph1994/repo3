package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * java.util.Collections集合的工具类
 * 该类提供了很多静态方法用于操作集合，其中有一个方法
 * sort是用来对list集合进行自然排序的(从小到大)
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
