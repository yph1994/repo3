package string;

/**
 * 字符串是不变对象，若想改变内容一定会创建新对象、
 * 这样的做法是源自JVM对字符串的优化，但是这样的做法
 * 弊端是修改字符串时性能低下（虽然这样的操作不频繁）
 */
public class Demo11 {
	public static void main(String[] args) {
		/**
		 * 频繁修改字符串会产生大量垃圾内存，对象、
		 * 开销大 运行效率差
		 * 结论：String不适合频繁修改
		 */
		String str ="a";
		for (int i = 0; i <100000000; i++) {
		str+="a";
		System.out.println("执行完毕");
		}
	}
}
