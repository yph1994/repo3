package file;

import java.io.File;

/**
 * ʹ��File����һ��Ŀ¼
 * @author Administrator
 *
 */
public class CreateDirDemo {
public static void main(String[] args) {
	/*
	 * �ڵ�ǰĿ¼���½�һ����Ϊdemo��Ŀ¼
	 */
	File dir= new File("demo");
	if (!dir.exists()){
		dir.mkdirs();//������Ŀ¼
	}else{
		System.out.println("��Ŀ¼�Ѵ��ڣ�");
	}
}
}
