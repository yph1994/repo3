package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 排序字符串
 */
public class SortListDemo3 {
public static void main(String[] args) {
	List<String>list = new ArrayList<String>();
	list.add("王岳岳");
	list.add("传奇");
	list.add("王路路大宝贝");
	list.add("施大宝贝");
	Collections.sort(list, new Comparator<String>() {
		public int compare(String o1, String o2) {
			
			return o1.length()-o2.length();
		}
	});
	System.out.println(list);

}
}
