package file;

import java.io.File;

/**
 * �����༶Ŀ¼
 * @author Administrator
 *
 */
public class CreateDirDemo2 {
public static void main(String[] args) {
	/*
	 * �ڵ�ǰĿ¼���½�һ����"./a/b/c/d/e/f"Ŀ¼
	 */
	File  dir =new File("./a/b/c/d/e/f");
	if(!dir.exists()){
	dir.mkdirs();
	System.out.println("Ŀ¼�Ѵ�����");

	}else{
		System.out.println("Ŀ¼�Ѵ��ڣ�");
	}
}
}
