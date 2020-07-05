package string;
/**
 * String substring(int start,int end)
 * 截取指定范围内的字符串，两个参数分别表示下标，
 * 从start处开始，end结束（不包含end处字符）
 * javaAPI中的参数有一个特点，通常用二个数字表示范围时都是、
 * “含头不含尾”
 */
public class Demo5 {
public static void main(String[] args) {
	String str="www.tedu.cn";
    String sub=	str.substring(4, 8);
    System.out.println(sub);
    //从指定位置开始截取到字符串末尾
    sub=str.substring(4);
    System.out.println(sub);
    
}
}
