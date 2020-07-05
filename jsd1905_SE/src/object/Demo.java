package object;
/**
 * 测试Object常见方法
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	Point p =new Point(1,2);
	/*
	 * Object定义看toString方法，意图是将
	 * 该类型实例转化为String，由于java中
	 * 所有的类都继承了Object，因此所有类都有该方法
	 * 也就是说所有的类都可以转换为字符串
	 * Object 定义的toString返回的字符串为该对象的地址信息
	 * 实际意义不大，所有通常我们使用时要重写这个方法、
	 * 注意：java提供的类大多重写过toString
	 */
	String str =p.toString();
	System.out.println(str);
	/*
	 * toString 方法在实际开发中通常都是使用
	 * 某个API 时被他自动调用的
	 * 输出时就会将给定对象toString返回的字符串输出
	 */
	System.out.println(p);
	
	
	
	Point p2=new Point(1,2);
	
	/*
	 * java中对于引用类型而言，常见的两个“等于”判断
	 * “==”和“equals” 
	 * 对于引用类型变量而言，“==”比较：
	 * “==”是值比较，那么就是比较两个变量的“地址”是否相同
	 * 若相同说明两个引用变量指向“同一个”对象
	 */
	System.out.println(p==p2);//false
	/*
	 * equals方法是比较两个引用类型变量指向的对象内容是否相同
	 * 注：当我们自定义一个类时，应当重写equals
	 * 若不重写直接使用Object定义的，它内部的实现就是用“==”判断的，
	 * 那就没有价值
	 * javaAPI提供的类大多重写了该方法，
	 * 比如String就重写了该方法
	 */
	System.out.println(p.equals(p2));
	
	/*
	 * 对于String而言，我们在判断两个字符串是否
	 * 相同时，一定要使用equals方法，因为“==”并不一定成立
	 */
	
	String s1="hello";
	String s2=new String("hello");
	if(s1.equals(s2)){
		System.out.println("相同");
	}else{
		System.out.println("不相同");
	}
	
}
}
