package string;
/**
 * String֧��������ʽ�ķ���һ
 * boolean matches��String regex��
 * ʹ�ø�����������ʽ��֤��ǰ�ַ����Ƿ���ϸ�ʽ
 * @author Administrator
 *
 */
public class demo12 {
public static void main(String[] args) {
	String email ="fancq@tedu.cn";
	/*
	 * \w+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
	 * ʹ���ַ������������ʾʱ�����������ʽ��
	 * ת���ַ��ģ���String�ж���ʱҪд����"\\"
	 * �������ת���ַ���ͻ����
	 */
	String regex="\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)";
	boolean match=email.matches(regex);
	if(match){
		System.out.println("������");
	}
	else{
		System.out.println("��������");
	}
}
}
