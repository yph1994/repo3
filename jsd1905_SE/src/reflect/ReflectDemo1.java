package reflect;

import java.lang.reflect.Method;

public class ReflectDemo1 {
/**
 * �������
 * ������java�е�һ����̬���ƣ�������ʹ����ʵ��������
 * ���÷������������Եȴ�ԭ�е��ڱ����ڼ�ȷ��תΪ�ڳ���
 * �����ڼ�ȷ��
 * ���������ߴ�������ȣ����ǻ��и�����ڴ濪���ͽϵ͵�
 * �����ٶ�
 * �ʶ�ʹ�÷��䣬��Ӧ����Ӧ��
 */
/*
 * Class�ࣺ
 * �����JVM��ÿһ�������ص��඼����ֻ��Ψһ��һ��Classʵ����֮��Ӧ��
 * ͨ�������Ի�ȡ�����ʾ�����һ����Ϣ�����磺����Щ��������Щ���ԣ���Щ��������
 * Ҳ���Կ���ʵ���������ʵ����
 * ���ԣ�����ĵ�һ�����ǻ�ȡҪ�������������󣬶���ȡһ������������
 * ���·�ʽ��
 * 1.ͨ������.class�õ���ÿһ���඼��һ����̬������class�����Ի�ȡ������
 * ��������ַ�ʽ����������ȷ��Ҫ��ȡĳ����������ʱ��ֱ��
 * ��
 * Class cls=String.class;
 * Class cls=ArrayList.class;
 * 2.Class.forName(String name)
 * ͨ��Class�ľ�̬����forName���ݸ������ַ�����ʾ����ȥ��̬������������磺
 * Class cls=Class.forName("java.lang.String")
 * 3.ClassLoader�������
 */
//	Class  cls=Person.class;
	/*
	 * �������������ʱ��ġ���ȫ�޶�����������
	 * ����.����
	 * ���磺
	 * java.lang.String
	 * java.util.ArrayList
	 * reflect.Person
	 */
	public static void main(String[] args) {
		
		try {
			Class  cls=Class.forName("reflect.Person");
			System.out.println(cls.getName());
//			Method[] methods=cls.getMethods();  ��ȡ��������з���(�̳г���ķ���)
			Method[] methods=cls.getDeclaredMethods();//��ȡ�Լ����� �ķ���
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
