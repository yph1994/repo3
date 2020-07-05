package thread;
/**
 * ���̲߳�����ȫ����
 * ������̲߳�������ͬһ�ٽ���Դʱ�������߳��л���ʱ����ȷ��
 * ���²���˳�����������������ʱ���ܵ���ϵͳ̱��
 * �ٽ���Դ��ͬһʱ��ֻ�ܱ�һ���̴߳������Դ
 * @author Administrator
 *
 */
public class SyncDemo {
public static void main(String[] args) {
	Table table= new Table();
	Thread t1=new Thread(){
		public void run() {
        while(true){
        	int bean=table.getBean();
        	Thread.yield();
        	System.out.println(getName()+":"+bean);
        }
		}
	};
	Thread t2=new Thread(){
		public void run() {
			while(true){
				int bean=table.getBean();
				Thread.yield();
				System.out.println(getName()+":"+bean);
			}
		}
	};
	t1.start();
	t2.start();
}
}
class Table{
	private int beans=20;
	/**
	 * ��һ����ʹ�ùؼ���synchronized���κ�
	 * ���������Ϊͬ������
	 * ͬ������Ҫ�����̲߳���ͬʱ���뵽�����ڲ�����
	 * ���롰�Ŷӡ����У�ͬ�����У�
	 * @return
	 */
	public  synchronized int getBean() {
		if(beans==0){
			throw new RuntimeException("û�ж���");
		}
		Thread.yield();//�����ó�CPUʱ�䣬ģ���߳�
		return beans--;
	}
}