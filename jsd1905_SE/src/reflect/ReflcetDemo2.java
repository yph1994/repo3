package reflect;

import java.util.Scanner;

/*
 * 通过反射实例化
 */
public class ReflcetDemo2 {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	/*
	 * 1.获取要实例化的类对象
	 * 2.通过类对象的newInstance方法实例化
	 * 注意，该方法要求实例化的类必须要有无参
	 * 构造方法，否则会抛出异常
	 */
//	Class cls=Class.forName("reflect.Pereson");
	Scanner sc= new Scanner(System.in);
	System.out.println("请输入要实例化的类名：");
	String className= sc.nextLine();
	Class cls=Class.forName(className);
	Object obj=cls.newInstance();
	System.out.println(obj);
}
}
