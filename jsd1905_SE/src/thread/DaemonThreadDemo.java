package thread;
/**
 * �ػ��߳�/��̨�߳�
 * �ػ��߳��ڴ���ʱ����ͨ�߳�һ����������������
 * ����ʱ������һ�㲻ͬ��
 * �����̽���ʱ�������ػ��̻߳�ǿ��ֹͣ
 * 
 * ���̵Ľ�����
 * ��һ��������û���κ���ͨ�߳�ʱ�����̽�����
 * @author Administrator
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose��let me go��");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				System.out.println("rose:aaaaaaaaaaa");
				System.out.println("�˽�");
				}
		};
		Thread jack =new Thread (){
			public void run() {
				
				while(true){
					System.out.println("you jump,i jump");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {	
					}
				}
			}
		};
		rose.start();
		jack.setDaemon(true);
		jack.start();
	}
}
