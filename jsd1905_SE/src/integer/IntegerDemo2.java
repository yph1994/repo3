package integer;
/**
 * ��װ�ೣ�ù���
 * @author Administrator
 *
 */
public class IntegerDemo2 {
public static void main(String[] args) {
	/*\
	 * �������͵İ�װ������������
	 * MAX_VALUE,MIN_VALUE;
	 * �ֱ��¼��Ӧ�������͵�ȡֵ��Χ
	 * 
	 */
	int imax=Integer.MAX_VALUE;
	System.out.println(imax);
	int imin=Integer.MIN_VALUE;
	System.out.println(imin);
	
	
	
	//��ȡlong���ֵ
	long lmax=Long.MAX_VALUE;
	System.out.println(lmax);
	
	double dmax=Double.MAX_VALUE;
	System.out.println(dmax);
	
	/*
	 * ��װ���ṩ��һ����̬������parseXXX
	 * ���Խ��ַ�������Ϊ��Ӧ�Ļ������͡�
	 * ���ַ���������ȷ�����������Ϳ��Ա����ֵ
	 * ��������ǻ�����쳣
	 */
	String str="123";
	int d=Integer.parseInt(str);
	System.out.println(d);
	
	
	double dou=Double.parseDouble(str);
	System.out.println(dou);
	

}
}
