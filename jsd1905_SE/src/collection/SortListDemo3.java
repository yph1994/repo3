package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * �����ַ���
 */
public class SortListDemo3 {
public static void main(String[] args) {
	List<String>list = new ArrayList<String>();
	list.add("������");
	list.add("����");
	list.add("��··�󱦱�");
	list.add("ʩ�󱦱�");
	Collections.sort(list, new Comparator<String>() {
		public int compare(String o1, String o2) {
			
			return o1.length()-o2.length();
		}
	});
	System.out.println(list);

}
}
