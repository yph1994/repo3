package lambda;
/**
 * lambda���ʽJDK8֮���Ƴ���һ��������
 * lambda������java����"�Ժ���ʽ���"
 * 
 * ��ֱ�۵ĸ��ܾ��ǿ�����һ�����ƺ�������ʽ���������ڲ���
 * �﷨
 * (����)->{
 * ������
 * }
 * ע�⣬lambda�������е������ڲ��ഴ��������ʹ�ã�
 * ���ڴ����ӿ���ֻ��һ�����󷽷�ʱ����
 * @author Administrator
 *
 */
public class LambdaDemo1 {
	public static void main(String[] args) {
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		};
	 Runnable r2=()->{
		 System.out.println("he");
	 };
	 //���������ֻ��һ����룬��ô������ġ�{}�����Ժ��Բ�д
	 Runnable r3=()->System.out.println("gun");
	}
}
