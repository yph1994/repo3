package reflect;

import java.lang.reflect.Method;

public class ReflectDemo1 {
/**
 * 反射机制
 * 反射是java中的一个动态机制，他可以使我们实例化对象，
 * 调用方法，操作属性等从原有的在编码期间确定转为在程序
 * 运行期间确定
 * 反射可以提高代码的灵活度，但是会有更多的内存开销和较低的
 * 运行速度
 * 适度使用反射，不应大量应用
 */
/*
 * Class类：
 * 类对象，JVM中每一个被加载的类都有且只有唯一的一个Class实例与之对应，
 * 通过它可以获取到其表示的类的一切信息，比如：有那些方法，那些属性，那些构造器，
 * 也可以快速实例化该类的实例。
 * 所以，反射的第一步就是获取要操作的类的类对象，而获取一个类的类对象有
 * 以下方式：
 * 1.通过类名.class得到，每一个类都有一个静态的属性class，可以获取到它的
 * 类对象，这种方式不灵活，但是在确定要获取某个类的类对象时最直接
 * 如
 * Class cls=String.class;
 * Class cls=ArrayList.class;
 * 2.Class.forName(String name)
 * 通过Class的静态方法forName根据给定的字符串表示的类去动态加载其类对象如：
 * Class cls=Class.forName("java.lang.String")
 * 3.ClassLoader类加载器
 */
//	Class  cls=Person.class;
	/*
	 * 这里参数的类名时类的“完全限定名”，即：
	 * 包名.类名
	 * 比如：
	 * java.lang.String
	 * java.util.ArrayList
	 * reflect.Person
	 */
	public static void main(String[] args) {
		
		try {
			Class  cls=Class.forName("reflect.Person");
			System.out.println(cls.getName());
//			Method[] methods=cls.getMethods();  获取该类的所有方法(继承超类的方法)
			Method[] methods=cls.getDeclaredMethods();//获取自己定义 的方法
			for (Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
