package string;
/**
 * String substring(int start,int end)
 * ��ȡָ����Χ�ڵ��ַ��������������ֱ��ʾ�±꣬
 * ��start����ʼ��end������������end���ַ���
 * javaAPI�еĲ�����һ���ص㣬ͨ���ö������ֱ�ʾ��Χʱ���ǡ�
 * ����ͷ����β��
 */
public class Demo5 {
public static void main(String[] args) {
	String str="www.tedu.cn";
    String sub=	str.substring(4, 8);
    System.out.println(sub);
    //��ָ��λ�ÿ�ʼ��ȡ���ַ���ĩβ
    sub=str.substring(4);
    System.out.println(sub);
    
}
}
