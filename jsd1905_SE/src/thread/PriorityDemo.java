package thread;
/**
 * �߳����ȼ�
 * �߳����ȼ�һ����10�����ֱ��Ӧ����1-10
 * ����1��ͣ�5Ĭ�ϣ�10���
 * �������߳����ȼ�Խ�߻�ȡ��CPUʱ��Ƭ�Ĵ���Խ��
 * �߳�����������뵽�̵߳�������ͬһ�����̲߳�������
 * ��ȡʱ��Ƭ��ֻ�ܱ��������䣬���ǿ���ͨ�������߳�
 * �����ȼ����̶ȸ����̻߳�ȡCPUʱ��Ƭ�ļ��� 
 * @author Administrator
 *
 */
public class PriorityDemo {
public static void main(String[] args) {
	Thread min= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("min");
			}
		}
	};
	Thread max= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("max");
			}
		}
	};
	Thread norm= new Thread(){
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println("norm");
			}
		}
	};
	//�����߳����ȼ�
	max.setPriority(Thread.MAX_PRIORITY);
	min.setPriority(Thread.MIN_PRIORITY);
	norm.setPriority(Thread.NORM_PRIORITY);
	min.start();
	max.start();
	norm.start();
}
}
