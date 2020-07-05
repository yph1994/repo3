package string;
/**
 * String的常量池、
 * JVM在堆中开辟了一段空间用来缓存所有使用字面量
 * 创建的字符串对象只要发现使用已经创建的字符串、
 * 字面量创建新字符串时JVM会直接使用缓存对象、
 * 而不是在创建新的对象，这样做可以避免内存中堆积大量一样
 * 内容的字符串，降低内存开销
 * @author Administrator
 *
 */
public class Demo2 {
public static void main(String[] args) {
	//直接量 (字面量)
	String s1="123abc";//
	System.out.println(s1);
	String s2="abc123";//重用s1创建的对象
	String s3="abc123";//一样重用
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	
	s1=s1+"!";//一旦修改内容，就会创建新对象，s1不再指向原对象
	System.out.println(s1);
	System.out.println(s2);
	
	String s4=new String("123abc");//new 是一个比较强制的操作，一定会创建新对象
	System.out.println("s4"+s4);
	System.out.println(s2==s4);//false
	/*
	 * 这里触发了编译器的一个特点
	 * 编译器在编译源代码时若发现一个计算表达式参与值都是字面量时
	 * 那么该计算表达式的结果是确定的，此时编译器会计算表达式的结果
	 * 并将结果替换为这个表达式,这样一来JVM每次执行字节码文件时就不用计算了
	 * 下面的代码会被编译器编译后改为：
	 * String s5="123abc"
	 */
	String s5="123"+"abc";
	System.out.println("s5:"+s5);
	System.out.println(s5==s2);//ture
	
	String s="123";
	String s6="abc"+s;
	System.out.println("s6"+s6);
	System.out.println(s2==s6);//false
			
	
	
}
}
