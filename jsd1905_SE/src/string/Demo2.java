package string;
/**
 * String�ĳ����ء�
 * JVM�ڶ��п�����һ�οռ�������������ʹ��������
 * �������ַ�������ֻҪ����ʹ���Ѿ��������ַ�����
 * �������������ַ���ʱJVM��ֱ��ʹ�û������
 * �������ڴ����µĶ������������Ա����ڴ��жѻ�����һ��
 * ���ݵ��ַ����������ڴ濪��
 * @author Administrator
 *
 */
public class Demo2 {
public static void main(String[] args) {
	//ֱ���� (������)
	String s1="123abc";//
	System.out.println(s1);
	String s2="abc123";//����s1�����Ķ���
	String s3="abc123";//һ������
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	
	s1=s1+"!";//һ���޸����ݣ��ͻᴴ���¶���s1����ָ��ԭ����
	System.out.println(s1);
	System.out.println(s2);
	
	String s4=new String("123abc");//new ��һ���Ƚ�ǿ�ƵĲ�����һ���ᴴ���¶���
	System.out.println("s4"+s4);
	System.out.println(s2==s4);//false
	/*
	 * ���ﴥ���˱�������һ���ص�
	 * �������ڱ���Դ����ʱ������һ��������ʽ����ֵ����������ʱ
	 * ��ô�ü�����ʽ�Ľ����ȷ���ģ���ʱ�������������ʽ�Ľ��
	 * ��������滻Ϊ������ʽ,����һ��JVMÿ��ִ���ֽ����ļ�ʱ�Ͳ��ü�����
	 * ����Ĵ���ᱻ������������Ϊ��
	 * String s5="123abc"
	 */
	String s5="123"+"abc";
	System.out.println("s5:"+s5);
	System.out.println(s5==s2);//ture
	
	String s="123";
	String s6="abc"+s;
	System.out.println("s6"+s6);
	System.out.println(s2==s6);//false
			
	
	
}
}
