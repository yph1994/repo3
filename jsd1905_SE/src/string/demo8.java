package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断一个字符串是否以给定字符开始或结尾
 * @author Administrator
 *
 */
public class demo8 {
	public static void main(String[] args) {
		String str= "thinking in java";
		boolean start=str.startsWith("t");
		System.out.println(start);
		boolean end=str.endsWith("ava");
		System.out.println(end);
	}

}
