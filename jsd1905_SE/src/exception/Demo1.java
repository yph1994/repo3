package exception;
/**
 * �쳣�������֮try-catch
 * �﷨
 * try{
 * ����Ƭ��
 * }catch(XXXException){
 * ��try�г���XXXException��Ĵ������
 * }
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("����ʼ��");
		try{
		String str= "a";
		/*
		 * ��JVMִ�д���ʱ������ĳ���쳣ʱ����
		 * ʵ������Ӧ���쳣ʵ���������׳�
		 */
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(Integer.parseInt(str));
		/*
		 *��try�����г���������µ����ݶ����ᱻִ�У� 
		 */
		System.out.println("!!!!!!!!");
		/*
		 * ���ǿ��������һ��catch������Exception
		 * �Ա�����Ϊһ��δ������쳣���³����ж�
		 */
		}catch(NullPointerException e){
			System.out.println("��ָ��");
		}
		/*
		 * catch �ǿ��Զ������ģ����try�в�ͬ�쳣
		 * ���ǿ��Էֱ𲶻񲢴���
		 */
		catch(StringIndexOutOfBoundsException e){
			System.out.println("�±�Խ��");
		}
		catch(Exception e){
			System.out.println("�������ǳ��˴�");
		}
		System.out.println("���������");
	}

}
