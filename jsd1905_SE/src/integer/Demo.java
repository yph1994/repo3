package integer;
/**
 * 包装类
 * 包装类一共只有8个，分别对应8个基本类型
 * 包装类是为了解决基本类型不能直接参与面向对象开发
 * 的问题使得基本类型可以以“对象”的形式存在
 * 所有的包装类都保存在java.lang包内，因此无需导包
 * @author Administrator
 *
 */
public class Demo {
public static void main(String[] args) {
	int d =1;
//	创建包装类
//	Integer i1= new Integer(d);
//	Integer i2=new  Integer(d);
//	java推荐我们使用valueOf方法创建包装类实例
	Integer i1= Integer.valueOf(d);
	Integer i2= Integer.valueOf(d);
	System.out.println("i1:"+i1);
	//Integer的valueOf|会重用1字节，-128-127
	System.out.println(i1==i2);//true
	System.out.println(i1.equals(i2));//true
	
	
	//Double不会重用任何对象
	Double d1= Double.valueOf(1.1);
	Double d2= Double.valueOf(1.1);
	System.out.println(d1==d2);//false
	System.out.println(d1.equals(d2));//true
	
	
	/*
	 * 包装类转化为基本类型
	 */
	
	int in= i1.intValue();
	System.out.println(in);
	double dou=i1.doubleValue();
	System.out.println(dou);
	//从大的往小的转可能会存在溢出，丢精度等问题
	byte  b =i1.byteValue();
	System.out.println(b);
	
}
}
