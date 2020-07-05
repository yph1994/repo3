package exception;
/**
 * 异常处理机制之try-catch
 * 语法
 * try{
 * 代码片段
 * }catch(XXXException){
 * 当try中出现XXXException后的处理代码
 * }
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("程序开始了");
		try{
		String str= "a";
		/*
		 * 当JVM执行代码时遇到了某个异常时，会
		 * 实例化对应的异常实例并将其抛出
		 */
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		/*
		 *在try语句块中出错代码以下的内容都不会被执行！ 
		 */
		System.out.println("!!!!!!!!");
		/*
		 * 我们可以在最后一个catch处捕获Exception
		 * 以避免因为一个未捕获的异常导致程序中断
		 */
		}catch(NullPointerException e){
			System.out.println("空指针");
		}
		/*
		 * catch 是可以定义多个的，针对try中不同异常
		 * 我们可以分别捕获并处理
		 */
		catch(StringIndexOutOfBoundsException e){
			System.out.println("下标越界");
		}
		catch(Exception e){
			System.out.println("反正就是出了错");
		}
		System.out.println("程序结束了");
	}

}
