package string;
/**
 * 由于String不适合频繁修改为了解决这个问题
 * java提供了一个专门用于修改字符串内容的类
 * java.lang.StringBuilder
 * 其提供了一组修改字符串的操作使用方便并且性能好、
 * 内部维护一个可变的字符数组，修改操作资源开销小
 * @author Administrator
 *
 */
public class StringBuilderDemo1 {
public static void main(String[] args) {
	String str ="努力学习java";
	StringBuilder builder=new StringBuilder(str);
	
	/*
	 * 增
	 * append():将给定内容拼接到字符串末尾
	 */
	builder.append(",为了找个好工作");
	//获取StringBuilder内部表示的字符串
	str=builder.toString();
	System.out.println(str);
	
	
	/*
	 * 改：replace
	 * 努力学习java，为了找个好工作！
	 * 努力学习java，就是为了改变世界
	 */
	builder.replace(9, 16, "就是为了改变世界");
	System.out.println(builder.toString());
	
	
	
   /*
    * 删：delete
    * 努力学习java，就是为了改变世界！
    * ，就是为了改变世界！
    */
	builder.delete(0, 8);
	System.out.println(builder.toString());
	/*
	 * 插：insert
	 * ，为了改变世界
	 * 活着，就是为了改变世界！
	 */
	builder.insert(0, "活着");
	System.out.println(builder.toString());
	
    
}
}
