package thread;
/*
 * �߳��ṩ��һ����̬������
 * static Thread currentThread();
 * �÷������Ի�ȡ��������������߳�
 * java�е����д��붼�ǿ��߳����еģ�main����Ҳ������
 * ֻ��������main�������̲߳��������Ǵ�����
 */
public class CurrentThreadDemo {
public static void main(String[] args) {
	Thread main =Thread.currentThread();
	System.out.println("����main�������߳��ǣ�"+main);
	dosome();
	Thread t= new Thread(){
		public void run() {
              Thread t= Thread.currentThread();
              System.out.println("�Զ����̣߳�"+t);
			dosome();
			
		}
	};
	t.start();
	
}
public  static void dosome() {
	Thread t= Thread.currentThread();
	System.out.println("dosome:"+t);

}
}
