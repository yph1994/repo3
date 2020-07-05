package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 查找表
 * Map体现的结构是一个多行两列的表格，其中左列称为key，右列称为value
 * Map总是成对保存数据的，并且总是根据key来获取对应的value
 * 因此我们可以将数据以value保存，查询条件以key形式保存
 * Map是一个接口，常用实现类：
 * java.util.HashMap 散列表（由散列算法实现）
 * @author Administrator
 *散列表是当今查询速度最快的数据结构！
 */
public class MapDemo1 {
public static void main(String[] args) {
	Map<String, Integer> map=new HashMap<>();
	/*
	 * V put(K k,V v)
	 * 将给定的键值对存入到Map中
	 * Map有有一个要求，key不允许重复（equals）
	 * 如果使用已有的key存放value，则会做替换value操作
	 * 此时返回值为原value，若key不存在，则返回值为null
	 */
	map.put("语文", 99);
	map.put("数学", 98);
	map.put("英语", 97);
	map.put("物理", 96);
	map.put("化学", 99);
	System.out.println(map);
	Integer num=map.put("英语", 72);
	System.out.println(map);
	System.out.println(num);
	/*
	 * V get(Object k)
	 * 根据给定的key获取对应 的value，如果给定的key不存在，
	 * 则返回值为null.
	 */
	num=map.get("数学");	
	System.out.println(num);
	/*
	 * 获取元素个数（一个键值对应为一个元素）
	 */
    int size=map.size();
    System.out.println("size:"+size);
//	map.clear();
    /*
     * 判断是否包含的key或value
     */
    boolean key= map.containsKey("政治");
    boolean value=map.containsValue(99);
    System.out.println(key);
    System.out.println(value);
    /*
     * V remove(Object k)
     * 将给定的key所对应的键值对删除
     * 返回值为该key对应的value
     */
	 num=map.remove("英语");
	 System.out.println(map);
	 System.out.println(num);
}
}
