package string;
/**
 * ����String���ʺ�Ƶ���޸�Ϊ�˽���������
 * java�ṩ��һ��ר�������޸��ַ������ݵ���
 * java.lang.StringBuilder
 * ���ṩ��һ���޸��ַ����Ĳ���ʹ�÷��㲢�����ܺá�
 * �ڲ�ά��һ���ɱ���ַ����飬�޸Ĳ�����Դ����С
 * @author Administrator
 *
 */
public class StringBuilderDemo1 {
public static void main(String[] args) {
	String str ="Ŭ��ѧϰjava";
	StringBuilder builder=new StringBuilder(str);
	
	/*
	 * ��
	 * append():����������ƴ�ӵ��ַ���ĩβ
	 */
	builder.append(",Ϊ���Ҹ��ù���");
	//��ȡStringBuilder�ڲ���ʾ���ַ���
	str=builder.toString();
	System.out.println(str);
	
	
	/*
	 * �ģ�replace
	 * Ŭ��ѧϰjava��Ϊ���Ҹ��ù�����
	 * Ŭ��ѧϰjava������Ϊ�˸ı�����
	 */
	builder.replace(9, 16, "����Ϊ�˸ı�����");
	System.out.println(builder.toString());
	
	
	
   /*
    * ɾ��delete
    * Ŭ��ѧϰjava������Ϊ�˸ı����磡
    * ������Ϊ�˸ı����磡
    */
	builder.delete(0, 8);
	System.out.println(builder.toString());
	/*
	 * �壺insert
	 * ��Ϊ�˸ı�����
	 * ���ţ�����Ϊ�˸ı����磡
	 */
	builder.insert(0, "����");
	System.out.println(builder.toString());
	
    
}
}
