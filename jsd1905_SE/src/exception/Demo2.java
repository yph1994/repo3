package exception;
/**
 * finally
 * finally语句块是在异常处理机制的最后一块，可以
 * 直接跟在try后面或者最后一个catch后面、
 * finally块可以保证只要程序执行到try当中，无论try
 * 当中的代码是否出现了异常finally都必定执行
 * 通常我们可以将释放资源这样的操作放在这里，比如
 * IO操作完毕后的关闭流
 * 
 * @author Administrator
 * 分别说明：final，finally，finalize
 * fianlize：是Object定义的方法，意味着Java中
 * 的所有类都有该方法，该方法是GC调用的方法，当一个对象
 * 即将被GC释放时，GC会调用该方法，调用完毕后该对象会被释放资源
 * 注：若重写该方法，该方法不能有耗时的操作。
 * 
 *
 */
public class Demo2 {
public static void main(String[] args) {
	System.out.println("程序开始了");
	try{
		String str="";
		System.out.println(str.length());
		//计算方法有return，也要先执行完finally后再返回
	}catch(Exception e){
		System.out.println("出错了");
		
	}finally{
		System.out.println("finally中的代码执行了");
	}
	
	
	System.out.println("程序结束了");
}
}
