package string;
/**
 * String ֧��������ʽ����2��
 * String[] split(String regax)
 * ����ǰ�ַ������������������ʽ�Ĳ��ֽ��в��
 * ������ֺ�Ĳ�����������ʽ����
 * @author Administrator
 *
 */
public class demo13 {
	public static void main(String[] args) {

		String line="adf312afds666fd6786fdf";
		//�������ֲ��ֲ�֣��õ����е���ĸ����
		/*String [] arr=line.split("\\d+");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		
		/*
		 * ����ڲ�ֵĹ����г����������Ŀɲ����
		 * �����м���ֳ�һ�����ַ�����
		 * ����ַ�����ʼ���ǲ����ʱ��ǰ��Ҳ����
		 * ��һ�����ַ���
		 * ע�⣺ ����ַ���ĩβ����ƥ�������ô��
		 * ��ֳ��Ŀմ�ȫ������
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
