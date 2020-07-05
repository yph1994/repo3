package integer;
/**
 * 包装类常用功能
 * @author Administrator
 *
 */
public class IntegerDemo2 {
public static void main(String[] args) {
	/*\
	 * 数字类型的包装类有两个常量
	 * MAX_VALUE,MIN_VALUE;
	 * 分别记录对应基本类型的取值范围
	 * 
	 */
	int imax=Integer.MAX_VALUE;
	System.out.println(imax);
	int imin=Integer.MIN_VALUE;
	System.out.println(imin);
	
	
	
	//获取long最大值
	long lmax=Long.MAX_VALUE;
	System.out.println(lmax);
	
	double dmax=Double.MAX_VALUE;
	System.out.println(dmax);
	
	/*
	 * 包装类提供了一个静态方法：parseXXX
	 * 可以将字符串解析为对应的基本类型、
	 * 该字符串必须正确描述基本类型可以保存的值
	 * 否则解析是会出现异常
	 */
	String str="123";
	int d=Integer.parseInt(str);
	System.out.println(d);
	
	
	double dou=Double.parseDouble(str);
	System.out.println(dou);
	

}
}
