package file;

import java.io.File;

/**
 * ʹ��Fileɾ��һ�������ļ�
 */
public class DeleteFileDemo {
public static void main(String[] args) {
	/*
	 * ����ǰĿ¼�µ�demo.txt�ļ�ɾ��
	 * "./"�ǿ��Ժ��Բ�д�ģ�Ĭ�Ͼ��ڵ�ǰĿ¼
	 */
	File file =new File("demo.txt");
	if(file.exists()){
		file.delete();
		System.out.println("�ļ���ɾ��");
	}else{
		System.out.println("�ļ������ڣ�");
	}
}
}
