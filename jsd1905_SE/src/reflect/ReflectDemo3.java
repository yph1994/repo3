package reflect;

import java.lang.reflect.Method;

/**
 * ʹ�÷�����Ƶ��÷���
 */
public class ReflectDemo3 {
public static void main(String[] args) throws Exception{
// 1ʵ����
	Class cls=Class.forName("reflect.Person");
	Object obj=cls.newInstance();
	Method method=cls.getMethod("sayHello");
	method.invoke(obj);

}
}
