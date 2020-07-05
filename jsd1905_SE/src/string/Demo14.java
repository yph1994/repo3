package string;
/**
 * String支持正则表达式三
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定内容
 * @author Administrator
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		String line="ads213fsad5423fasd";
		String str= line.replaceAll("[0-9]+", "Love and Peace");
		System.out.println(str);
	}

}
