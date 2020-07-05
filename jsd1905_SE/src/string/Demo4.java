package string;
/**
 * int  indexOf(String str)
 * 检索给定字符串在当前字符串中的位置
 * 若当前字符串不包括给定内容，则返回值为-1
 * @author Administrator
 *
 */
public class Demo4 {
public static void main(String[] args) {
	             
	String str ="thinking in java";
	int index=str.indexOf("in");
	//查找str中"in"所在位置
	System.out.println(index);
	//从指定位置开始查找第一次出现in的位置
	index =str.indexOf("in",3);
	System.out.println(index);
	//查找最后一次出现in的位置
	index =str.lastIndexOf("in");
	System.out.println(index);
}
}
