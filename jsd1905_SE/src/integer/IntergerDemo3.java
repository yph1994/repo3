package integer;
/*
 * JDK1.5之后推出了一个特性：自动拆装箱
 * 该特性是编译器认可的，当编译器编译源代码时发现
 * 有基本类型和引用类型相互赋值操作时，会自动补全
 * 代码将二者进行对应的转换工作，从而使我们在源代码使用时
 * 包装类与基本类型可以进行直接相互赋值
 */
public class IntergerDemo3 {
public static void main(String[] args) {
	/*
	 * 触发编译器自动装箱特性
	 * 编译器会将下列代码改为：|
	 * Integer i = Integer.valueOf(123);
	 * 将基本类型转化为包装类
	 */
	Integer i=123;
	Character c='c';
	
	/*
	 * 触发自动拆箱特性、；
	 * 代码：int d = i.intValue()；
	 * 将包装类转化为基本类型
	 */
	int d = i;
}
}
