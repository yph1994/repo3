package string;
/**
 * int  indexOf(String str)
 * ���������ַ����ڵ�ǰ�ַ����е�λ��
 * ����ǰ�ַ����������������ݣ��򷵻�ֵΪ-1
 * @author Administrator
 *
 */
public class Demo4 {
public static void main(String[] args) {
	             
	String str ="thinking in java";
	int index=str.indexOf("in");
	//����str��"in"����λ��
	System.out.println(index);
	//��ָ��λ�ÿ�ʼ���ҵ�һ�γ���in��λ��
	index =str.indexOf("in",3);
	System.out.println(index);
	//�������һ�γ���in��λ��
	index =str.lastIndexOf("in");
	System.out.println(index);
}
}
