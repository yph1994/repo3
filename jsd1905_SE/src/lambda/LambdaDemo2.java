package lambda;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class LambdaDemo2 {
public static void main(String[] args) {
	List<String>list=new ArrayList<>();
	list.add("����ʦ");
	list.add("����");
	list.add("С����ʦ");
//	Collections.sort(list,new Comparator<String>() {
//		public int compare(String o1, String o2) {
//			return o1.length()-o2.length();
//		}
//	});
	//����������ݴ�������������Ĳ������ͣ���������ָ��
//	Comparator<String> c=(o1,o2)->{return o1.length()-o2.length();};
	//������Ժ��ԡ�{}������ô������returnʱ��return�ؼ���ҲҪһͬ����
//  Comparator<String> c=(o1,o2)-> o1.length()-o2.length();
	Collections.sort(list, (o1,o2)->o1.length()-o2.length());
	System.out.println(list);
}
}
