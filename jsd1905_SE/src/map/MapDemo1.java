package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map ���ұ�
 * Map���ֵĽṹ��һ���������еı���������г�Ϊkey�����г�Ϊvalue
 * Map���ǳɶԱ������ݵģ��������Ǹ���key����ȡ��Ӧ��value
 * ������ǿ��Խ�������value���棬��ѯ������key��ʽ����
 * Map��һ���ӿڣ�����ʵ���ࣺ
 * java.util.HashMap ɢ�б���ɢ���㷨ʵ�֣�
 * @author Administrator
 *ɢ�б��ǵ����ѯ�ٶ��������ݽṹ��
 */
public class MapDemo1 {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();
	/*
	 * V put(K k,V v)
	 * �������ļ�ֵ�Դ��뵽Map��
	 * Map����һ��Ҫ��key�������ظ���equals��
	 * ���ʹ�����е�key���value��������滻value����
	 * ��ʱ����ֵΪԭvalue����key�����ڣ��򷵻�ֵΪnull
	 */
	map.put("����", 99);
	map.put("��ѧ", 98);
	map.put("Ӣ��", 97);
	map.put("����", 96);
	map.put("��ѧ", 99);
	System.out.println(map);
	Integer num=map.put("Ӣ��", 72);
	System.out.println(map);
	System.out.println(num);
	/*
	 * V get(Object k)
	 * ���ݸ�����key��ȡ��Ӧ ��value�����������key�����ڣ�
	 * �򷵻�ֵΪnull.
	 */
	num=map.get("��ѧ");	
	System.out.println(num);
	/*
	 * ��ȡԪ�ظ�����һ����ֵ��ӦΪһ��Ԫ�أ�
	 */
    int size=map.size();
    System.out.println("size:"+size);
//	map.clear();
    /*
     * �ж��Ƿ������key��value
     */
    boolean key= map.containsKey("����");
    boolean value=map.containsValue(99);
    System.out.println(key);
    System.out.println(value);
    /*
     * V remove(Object k)
     * ��������key����Ӧ�ļ�ֵ��ɾ��
     * ����ֵΪ��key��Ӧ��value
     */
	 num=map.remove("Ӣ��");
	 System.out.println(map);
	 System.out.println(num);
}
}
