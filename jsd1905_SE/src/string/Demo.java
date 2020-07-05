package string;
/**
 * String 支持正则表达式三
 * String replaceAll(String regax,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	/*
	 * 将数字部分替换为"#NUMBER#"
	 */
	String line= "123dsf434fdfs543fda";
	String str =line.replaceAll("[0-9]+","#NUMBER#");
	System.out.println(str);
}
}
