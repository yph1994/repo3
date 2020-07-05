package lambda;
/**
 * lambda表达式JDK8之后推出的一个新特性
 * lambda可以让java编码"以函数式编程"
 * 
 * 最直观的感受就是可以用一个类似函数的形式创建匿名内部类
 * 语法
 * (参数)->{
 * 方法体
 * }
 * 注意，lambda不是所有的匿名内部类创建都可以使用，
 * 仅在创建接口中只有一个抽象方法时可用
 * @author Administrator
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		};
	 Runnable r2=()->{
		 System.out.println("he");
	 };
	 //如果方法中只有一句代码，那么方法体的“{}”可以忽略不写
	 Runnable r3=()->System.out.println("gun");
	}
}
