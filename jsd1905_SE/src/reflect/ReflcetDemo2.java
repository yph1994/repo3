package reflect;

import java.util.Scanner;

/*
 * ͨ������ʵ����
 */
public class ReflcetDemo2 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	/*
	 * 1.��ȡҪʵ�����������
	 * 2.ͨ��������newInstance����ʵ����
	 * ע�⣬�÷���Ҫ��ʵ�����������Ҫ���޲�
	 * ���췽����������׳��쳣
	 */
//	Class cls=Class.forName("reflect.Pereson");
	Scanner sc= new Scanner(System.in);
	System.out.println("������Ҫʵ������������");
	String className= sc.nextLine();
	Class cls=Class.forName(className);
	Object obj=cls.newInstance();
	System.out.println(obj);
}
}
