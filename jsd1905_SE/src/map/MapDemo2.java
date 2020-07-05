package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map�ı���
 * ���������ַ�ʽ��
 * 1.�������е�key
 * 2.�������е�value
 * 3.�������еļ�ֵ��
 * @author Administrator
 *
 */
public class MapDemo2 {
public static void main(String[] args) {
	Map<String, Integer>map=new HashMap<>();
	map.put("����", 99);
	map.put("��ѧ", 98);
	map.put("Ӣ��", 97);
	map.put("����", 96);
	map.put("��ѧ", 99);
	System.out.println(map);
	/*
	 * Set keySet()
	 * ����ǰMap�����е�key��һ��Set������ʽ����
	 * ����������Ͼ͵��ڱ���������key
	 */
	Set<String> keyset=map.keySet();
	for (String key : keyset) {
		System.out.println("key��"+key);
	}
	/*
	 * ����ÿһ���ֵ��
	 * Set<Entry>entrySet()
	 * ����ǰMap��ÿһ���ֵ�ԣ�����Entryʵ������һ��Set������ʽ���巵�ء�
	 * java.util.Map.Entry
	 * Entry��ÿһ��ʵ�����ڱ�ʾMap�е�һ���ֵ�ԣ����ṩ��getKey��getValue����
	 * ���ڻ�ȡ�����ֵ�Ե�key��valueֵ
	 */
	Set<Entry<String,Integer>> entrySet=map.entrySet();
	for(Entry<String, Integer> entry :entrySet){
		String key=entry.getKey();
		Integer value=entry.getValue();
		System.out.println(entry);
		System.out.println(key+":"+value);
	}
	Collection<Integer>values=map.values();
	for (Integer value : values) {
		System.out.println(value);
	}
}
}
