package exception;
/*
 * �쳣���÷���
 */
public class Demo8 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try {
			String str="a";
			System.out.println(Integer.parseInt(str));
		} catch (Exception e) {//��������ջ��Ϣ������debug
			e.printStackTrace();
			//��ȡ������Ϣ
			String message=e.getMessage();
			System.out.println("message:"+message);
			System.out.println("������");
	}
		System.out.println("���������");
	}	
}
