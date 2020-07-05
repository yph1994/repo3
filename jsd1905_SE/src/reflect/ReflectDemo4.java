package reflect;

import java.lang.reflect.Method;

public class ReflectDemo4 {
public static void main(String[] args) throws Exception{
//	Class.forName("reflect.Person").getMethod("say", String.class).invoke(Class.forName("reflect.Person").newInstance(),"王岳");
	Class cls=Class.forName("reflect.Person");
	Object object=cls.newInstance();
	Method method=cls.getMethod("say", String.class);
	method.invoke(object, "张三");
	Method method2=cls.getMethod("say", String.class,int.class);
	method2.invoke(object,"张三",22);
	
}
}
