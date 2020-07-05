package exception;
/**
 * 测试异常的抛出
 * @author Administrator
 *
 */
public class Person {
 private  int age;

public int getAge() {
	return age;
}
/*
 * 通常使用throw主动对外抛出异常会在以下情况发生
 * 1.程序确实出现了异常，但是该异常不应当在当前代码片段
 * 被解决时可以对外抛出 给调用者解决
 * 2.程序遇到一个满足语法要求但是不满足业务逻辑要求
 * 的情况是可以对外抛出异常（下面的例子就是这个情况）
 */
public void setAge(int age) throws IllegalAgeException{
	if(age<0||age>100){
		//使用throw关键字加异常实例，用于对外抛出异常
		/*
		 * 当一个方法使用throws抛出一个异常时，只有
		 * RuntimeException及其子类型被抛出时可以
		 * 不写throws，剩下的必须写，否则编译不通过
		 */
		throw new IllegalAgeException("年龄不合法");
	}
	this.age = age;
}
 
}
