package object;
/**
 * ����Object��������
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	Point p =new Point(1,2);
	/*
	 * Object���忴toString��������ͼ�ǽ�
	 * ������ʵ��ת��ΪString������java��
	 * ���е��඼�̳���Object����������඼�и÷���
	 * Ҳ����˵���е��඼����ת��Ϊ�ַ���
	 * Object �����toString���ص��ַ���Ϊ�ö���ĵ�ַ��Ϣ
	 * ʵ�����岻������ͨ������ʹ��ʱҪ��д���������
	 * ע�⣺java�ṩ��������д��toString
	 */
	String str =p.toString();
	System.out.println(str);
	/*
	 * toString ������ʵ�ʿ�����ͨ������ʹ��
	 * ĳ��API ʱ�����Զ����õ�
	 * ���ʱ�ͻὫ��������toString���ص��ַ������
	 */
	System.out.println(p);
	
	
	
	Point p2=new Point(1,2);
	
	/*
	 * java�ж����������Ͷ��ԣ����������������ڡ��ж�
	 * ��==���͡�equals�� 
	 * �����������ͱ������ԣ���==���Ƚϣ�
	 * ��==����ֵ�Ƚϣ���ô���ǱȽ����������ġ���ַ���Ƿ���ͬ
	 * ����ͬ˵���������ñ���ָ��ͬһ��������
	 */
	System.out.println(p==p2);//false
	/*
	 * equals�����ǱȽ������������ͱ���ָ��Ķ��������Ƿ���ͬ
	 * ע���������Զ���һ����ʱ��Ӧ����дequals
	 * ������дֱ��ʹ��Object����ģ����ڲ���ʵ�־����á�==���жϵģ�
	 * �Ǿ�û�м�ֵ
	 * javaAPI�ṩ��������д�˸÷�����
	 * ����String����д�˸÷���
	 */
	System.out.println(p.equals(p2));
	
	/*
	 * ����String���ԣ��������ж������ַ����Ƿ�
	 * ��ͬʱ��һ��Ҫʹ��equals��������Ϊ��==������һ������
	 */
	
	String s1="hello";
	String s2=new String("hello");
	if(s1.equals(s2)){
		System.out.println("��ͬ");
	}else{
		System.out.println("����ͬ");
	}
	
}
}
