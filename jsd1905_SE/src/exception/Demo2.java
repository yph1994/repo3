package exception;
/**
 * finally
 * finally���������쳣������Ƶ����һ�飬����
 * ֱ�Ӹ���try����������һ��catch���桢
 * finally����Ա�ֻ֤Ҫ����ִ�е�try���У�����try
 * ���еĴ����Ƿ�������쳣finally���ض�ִ��
 * ͨ�����ǿ��Խ��ͷ���Դ�����Ĳ��������������
 * IO������Ϻ�Ĺر���
 * 
 * @author Administrator
 * �ֱ�˵����final��finally��finalize
 * fianlize����Object����ķ�������ζ��Java��
 * �������඼�и÷������÷�����GC���õķ�������һ������
 * ������GC�ͷ�ʱ��GC����ø÷�����������Ϻ�ö���ᱻ�ͷ���Դ
 * ע������д�÷������÷��������к�ʱ�Ĳ�����
 * 
 *
 */
public class Demo2 {
public static void main(String[] args) {
	System.out.println("����ʼ��");
	try{
		String str="";
		System.out.println(str.length());
		//���㷽����return��ҲҪ��ִ����finally���ٷ���
	}catch(Exception e){
		System.out.println("������");
		
	}finally{
		System.out.println("finally�еĴ���ִ����");
	}
	
	
	System.out.println("���������");
}
}
