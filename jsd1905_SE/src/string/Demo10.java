package string;
/**
 *static String  valueOf(XXX xxx) 
 *字符串提供了一组静态的重载的valueOf方法，作用是将
 *其他类型转换为字符串
 */
public class Demo10 {
public static void main(String[] args) {
	int a=123;
	String s1=String.valueOf(a);
	System.out.println(s1);
	String s3=a+"";//任何与字符串相连都会转化成字符
	System.out.println(s3);
}
}
