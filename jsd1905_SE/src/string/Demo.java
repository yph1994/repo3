package string;
/**
 * String ֧��������ʽ��
 * String replaceAll(String regax,String str)
 * ����ǰ�ַ���������������ʽ�Ĳ����滻Ϊ��������
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	/*
	 * �����ֲ����滻Ϊ"#NUMBER#"
	 */
	String line= "123dsf434fdfs543fda";
	String str =line.replaceAll("[0-9]+","#NUMBER#");
	System.out.println(str);
}
}
