package reflect;

import java.lang.reflect.Method;

/**
 * 使用反射机制调用方法
 */
public class ReflectDemo3 {
public static void main(String[] args) throws Exception{
// 1实例化
	Class cls=Class.forName("reflect.Person");
	Object obj=cls.newInstance();
	Method method=cls.getMethod("sayHello");
	method.invoke(obj);

}
}
