package thread;
/**
 * 守护线程/后台线程
 * 守护线程在创建时与普通线程一样，并无区别但是在
 * 结束时机上有一点不同，
 * 当进程结束时，所欲守护线程会强制停止
 * 
 * 进程的结束：
 * 当一个进程中没有任何普通线程时，进程结束。
 * @author Administrator
 *
 */
public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread rose = new Thread(){
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("rose：let me go！");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
				System.out.println("rose:aaaaaaaaaaa");
				System.out.println("扑街");
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
