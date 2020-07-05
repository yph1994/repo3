package string;
/**
 * 文档注释是解释一个类的功能或一个方法的功能以及常量

 * 在类上定义是用来说明当前类的功能以及设计意图
 
 * @author Administrator 
 * @version 1.0
 * @see 参考某某类
 * @since  JDK 1.0 始于那个版本
 * 
 *
 */
public class Demo1 {
	/**
	 * sayHello方法中的问候语
	 */
	
	public static final String INFO ="hello";
	/**
	 * 对给定的用户添加一个问候语
	 * @param name  参数  给定的用户名
	 * @return    含有问候语的内容 
	 */
	public String sayHello(String name){
		return INFO+name;
	}

}
