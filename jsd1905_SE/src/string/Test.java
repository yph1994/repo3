package string;
/**
 * ��ɽ�ȡ������ַ�е�����
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
    	//���ҵ�һ��".֮���һ���ַ���λ��
    	int index=url.indexOf(".");
    	//���ҵڶ���"."��λ��
    	int index2=url.indexOf(".",index+1);
    	String str=url.substring(index+1, index2);
    	return str;
    }

}
