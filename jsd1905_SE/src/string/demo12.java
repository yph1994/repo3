package string;
/**
 * String支持正则表达式的方法一
 * boolean matches（String regex）
 * 使用给定的正则表达式验证当前字符串是否符合格式
 * @author Administrator
 *
 */
public class demo12 {
public static void main(String[] args) {
	String email ="fancq@tedu.cn";
	/*
	 * \w+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
	 * 使用字符串描述正则表示时，如果正则表达式有
	 * 转义字符的，在String中定义时要写两个"\\"
	 * 否则会有转义字符冲突问题
	 */
	String regex="\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)";
	boolean match=email.matches(regex);
	if(match){
		System.out.println("是邮箱");
	}
	else{
		System.out.println("不是邮箱");
	}
}
}
