package integer;
/**
 * ��װ��
 * ��װ��һ��ֻ��8�����ֱ��Ӧ8����������
 * ��װ����Ϊ�˽���������Ͳ���ֱ�Ӳ���������󿪷�
 * ������ʹ�û������Ϳ����ԡ����󡱵���ʽ����
 * ���еİ�װ�඼������java.lang���ڣ�������赼��
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	int d =1;
//	������װ��
//	Integer i1= new Integer(d);
//	Integer i2=new  Integer(d);
//	java�Ƽ�����ʹ��valueOf����������װ��ʵ��
	Integer i1= Integer.valueOf(d);
	Integer i2= Integer.valueOf(d);
	System.out.println("i1:"+i1);
	//Integer��valueOf|������1�ֽڣ�-128-127
	System.out.println(i1==i2);//true
	System.out.println(i1.equals(i2));//true
	
	
	//Double���������κζ���
	Double d1= Double.valueOf(1.1);
	Double d2= Double.valueOf(1.1);
	System.out.println(d1==d2);//false
	System.out.println(d1.equals(d2));//true
	
	
	/*
	 * ��װ��ת��Ϊ��������
	 */
	
	int in= i1.intValue();
	System.out.println(in);
	double dou=i1.doubleValue();
	System.out.println(dou);
	//�Ӵ����С��ת���ܻ��������������ȵ�����
	byte  b =i1.byteValue();
	System.out.println(b);
	
}
}
