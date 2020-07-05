package exception;
/**
 * 年龄不合法
 * 自定义异常，通常用来定义程序中的业务逻辑错误
 * 自定义异常创建需要做以下几件事：
 * 1.类名要见名知意
 * 2.需要继承自Exception（直接或间接继承均可）
 * 3.定义Exception中定义的各种构造方法
 * 4.提供序列化版本号（因为Exception实现了序列化接口）
 * @author Administrator
 *
 */
public class IllegalAgeException  extends Exception{

	private static final long serialVersionUID = 1L;

	public IllegalAgeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IllegalAgeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
