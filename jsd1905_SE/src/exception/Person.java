package exception;
/**
 * �����쳣���׳�
 * @author Administrator
 *
 */
public class Person {
 private  int age;

public int getAge() {
	return age;
}
/*
 * ͨ��ʹ��throw���������׳��쳣���������������
 * 1.����ȷʵ�������쳣�����Ǹ��쳣��Ӧ���ڵ�ǰ����Ƭ��
 * �����ʱ���Զ����׳� �������߽��
 * 2.��������һ�������﷨Ҫ���ǲ�����ҵ���߼�Ҫ��
 * ������ǿ��Զ����׳��쳣����������Ӿ�����������
 */
public void setAge(int age) throws IllegalAgeException{
	if(age<0||age>100){
		//ʹ��throw�ؼ��ּ��쳣ʵ�������ڶ����׳��쳣
		/*
		 * ��һ������ʹ��throws�׳�һ���쳣ʱ��ֻ��
		 * RuntimeException���������ͱ��׳�ʱ����
		 * ��дthrows��ʣ�µı���д��������벻ͨ��
		 */
		throw new IllegalAgeException("���䲻�Ϸ�");
	}
	this.age = age;
}
 
}
