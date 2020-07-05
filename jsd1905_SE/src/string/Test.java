package string;
/**
 * 完成截取给定地址中的域名
 * @author Administrator
 *
 */
public class Test {
	 
	   
	   
	public static void main(String[] args) {
		
		
		String u1="http://www.tedu.cn";
		String u2="www.baidu.com";
		String h1=getHostName(u1);
		System.out.println(h1);//tedu
		String h2=getHostName(u2);
		System.out.println(h2);//baidu
	}
    public static String getHostName(String url){
    	//查找第一个".之后第一个字符的位置
    	int index=url.indexOf(".");
    	//查找第二个"."的位置
    	int index2=url.indexOf(".",index+1);
    	String str=url.substring(index+1, index2);
    	return str;
    }

}
