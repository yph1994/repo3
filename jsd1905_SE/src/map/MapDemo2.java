package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * 遍历的三种方式：
 * 1.遍历所有的key
 * 2.遍历所有的value
 * 3.遍历所有的键值对
 * @author Administrator
 *
 */
public class MapDemo2 {
public static void main(String[] args) {
	Map<String, Integer>map=new HashMap<>();
	map.put("语文", 99);
	map.put("数学", 98);
	map.put("英语", 97);
	map.put("物理", 96);
	map.put("化学", 99);
	System.out.println(map);
	/*
	 * Set keySet()
	 * 将当前Map中所有的key以一个Set集合形式返回
	 * 遍历这个集合就等于遍历了所有key
	 */
	Set<String> keyset=map.keySet();
	for (String key : keyset) {
		System.out.println("key："+key);
	}
	/*
	 * 遍历每一组键值对
	 * Set<Entry>entrySet()
	 * 将当前Map中每一组键值对（若干Entry实例）以一个Set集合形式集体返回。
	 * java.util.Map.Entry
	 * Entry的每一个实例用于表示Map中的一组键值对，其提供的getKey和getValue方法
	 * 用于获取这组键值对的key，value值
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
