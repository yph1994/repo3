package file;

import java.io.File;

/**
 * ɾ��һ��Ŀ¼
 */
public class DeleteDirDemo {
public static void main(String[] args) {
	/*
	 * ����ǰĿ¼�µ�demoĿ¼ɾ��
	 */
	File dir =new File("demo");
	if(dir.exists()){
		dir.delete();
		/*
		 * ɾ��ʱҪע�⣬��Ŀ¼������һ����Ŀ¼�ſ��Ա�ɾ����                                                      
		 */
		System.out.println("ɾ�����");
	}else{
		System.out.println("Ŀ¼������");
	}
}
}
