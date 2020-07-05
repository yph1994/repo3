package exception;
/*
 * 异常常用方法
 */
public class Demo8 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {//输出错误堆栈信息，编译debug
			e.printStackTrace();
			//获取错误消息
			String message=e.getMessage();
			System.out.println("message:"+message);
			System.out.println("出错了");
	}
		System.out.println("程序出错了");
	}	
}
