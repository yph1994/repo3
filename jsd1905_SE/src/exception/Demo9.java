package exception;
/**
 * finally 常见笔试题
 * @author Administrator
 *
 */
public class Demo9 {
public static void main(String[] args) {
	System.out.println(test("0")+","+test(null)+","+test(""));//3,3,3
}
public static int test(String str){
	try {
		return str.charAt(0)-'0';
		
	}catch (NullPointerException e) {
		return 1;
	} catch (Exception e) {
		return 2;
	}
	finally{
		/*
		 * fianlly中通常不能写return，否则必定返回fianlly中的return的内容
		 */
		return 3;
	}
}
}
