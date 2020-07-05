package string;

/**
 * char charAt(int index)
 * 获取当前字符串中指定位置对应的字符
 */
public class demo7 {
	public static void main(String[] args) {
		String str="thinking in java";
		char c= str.charAt(9);
		System.out.println(c);	
		
		//检测回文
		String line="上海自来水来自海上";
		for (int i = 0; i < line.length()/2; i++) {
			char c1=line.charAt(i);
			char c2=line.charAt(line.length()-1-i);
			if(c1!=c2){
				System.out.println("不");
				break;
				/*
				 * System.out.println("不是回文！");
				 * return;
				 */
				
			}
		}
		System.err.println("是回文！");
	
	}
}
