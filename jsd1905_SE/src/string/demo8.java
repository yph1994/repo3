package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * �ж�һ���ַ����Ƿ��Ը����ַ���ʼ���β
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
