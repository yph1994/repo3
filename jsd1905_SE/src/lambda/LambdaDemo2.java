package lambda;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class LambdaDemo2 {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("苍老师");
	list.add("传奇");
	list.add("小泽老师");
//	Collections.sort(list,new Comparator<String>() {
//		public int compare(String o1, String o2) {
//			return o1.length()-o2.length();
//		}
//	});
	//编译器会根据代码分析出方法的参数类型，所有无需指定
//	Comparator<String> c=(o1,o2)->{return o1.length()-o2.length();};
	//如果可以忽略“{}”，那么方法有return时，return关键字也要一同忽略
//  Comparator<String> c=(o1,o2)-> o1.length()-o2.length();
	Collections.sort(list, (o1,o2)->o1.length()-o2.length());
	System.out.println(list);
}
}
