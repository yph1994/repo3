package exception;
/**
 * finally ����������
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
		 * fianlly��ͨ������дreturn������ض�����fianlly�е�return������
		 */
		return 3;
	}
}
}
