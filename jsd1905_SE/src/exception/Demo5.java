package exception;
/**
 * �쳣���׳�
 */
public class Demo5 {
public static void main(String[] args) {
	Person p =new Person();
	//�����﷨�����ǲ�����ҵ���߼�
	/*
	 * d������һ������throws�����쳣�׳��ķ���ʱ
	 * �����������Ƿ��д�����쳣�����û������벻ͨ��
	 * �����쳣�ķ�ʽ������
	 * 1.ʹ��try-catch������쳣
	 * 2.�ڵ�ǰ�����ϼ���ʹ��throws�������쳣���׳�
	 * ����������ȡ���ڴ����쳣����������
	 */
	try {
		p.setAge(1000000);
	} catch (IllegalAgeException e) {
		
		e.printStackTrace();
	}
	System.out.println(p.getAge());
}
}
