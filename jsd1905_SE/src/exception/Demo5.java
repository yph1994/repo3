package exception;
/**
 * 异常的抛出
 */
public class Demo5 {
public static void main(String[] args) {
	Person p =new Person();
	//符合语法，但是不符合业务逻辑
	/*
	 * d当调用一个含有throws声明异常抛出的方法时
	 * 编译器会检查是否有处理该异常，如果没有则编译不通过
	 * 处理异常的方式有两种
	 * 1.使用try-catch处理该异常
	 * 2.在当前方法上继续使用throws声明该异常的抛出
	 * 具体用哪种取决于处理异常的责任问题
	 */
	try {
		p.setAge(1000000);
	} catch (IllegalAgeException e) {
		
		e.printStackTrace();
	}
	System.out.println(p.getAge());
}
}
