package string;
/**
 * String֧��������ʽ��
 * String replaceAll(String regex,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ��������
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
