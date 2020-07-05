package string;
/**
 * String 支持正则表达式方法2：
 * String[] split(String regax)
 * 将当前字符串按照满足的正则表达式的部分进行拆分
 * 并将拆分后的部分以数组形式返回
 * @author Administrator
 *
 */
public class demo13 {
	public static void main(String[] args) {

		String line="adf312afds666fd6786fdf";
		//按照数字部分拆分，得到所有的字母部分
		/*String [] arr=line.split("\\d+");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		/*
		 * 如果在拆分的过程中出现了连续的可拆分项
		 * 他们中间会拆分出一个空字符串、
		 * 如果字符串开始就是拆分项时，前面也会拆分
		 * 处一个空字符串
		 * 注意： 如果字符串末尾连续匹配拆分项，那么、
		 * 拆分出的空串全部忽略
		 */
		String [] arr=line.split("\\d");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}
		String image="123.jpg";
		String[] data=image.split("\\.");
		image=System.currentTimeMillis()+"."+data[1];
		System.out.println(image);
				
		
		
}
}
