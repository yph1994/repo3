package thread;
/**
 * ��ȡ �߳���Ϣ����ط���
 */

public class ThreadInfoDemo {
public static void main(String[] args) {
	Thread main=Thread.currentThread();
	//��ȡ�߳�����
	String name = main.getName();
	System.out.println("name:"+name);
	
	//��ȡΨһ��ʶ
	long id = main.getId();
	System.out.println("id:"+id);
	//��ȡ�߳����ȼ�
	int priority= main.getPriority();
	System.out.println("���ȼ���"+priority);
	//�߳��Ƿ����
	boolean isAlive = main.isAlive();
	//�Ƿ�Ϊ�ػ��߳�
	boolean isDaemon =main.isDaemon();
	//�߳��Ƿ��ж�
	boolean isInterrupted=main.isInterrupted();
	System.out.println("�Ƿ���ţ�"+isAlive);
	System.out.println("�Ƿ�Ϊ�ػ��̣߳�"+isDaemon);
	System.out.println("�Ƿ��жϣ�"+isInterrupted);
}
}
