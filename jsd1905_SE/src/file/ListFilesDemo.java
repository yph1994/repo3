package file;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�е���������
 * @author Administrator
 *
 */
public class ListFilesDemo {
public static void main(String[] args) {
	/*
	 * ��ȡ��ǰĿ¼�µ���������
	 */
	File dir =new File(".");
	/*
	 * �жϵ�ǰfile��ʾ���Ƿ�Ϊ�ļ�
	 * boolean isFile();
	 * �жϵ�ǰfile��ʾ���Ƿ�ΪĿ¼
	 * boolean isDirectory();
	 */
	if(dir.isDirectory()){
		/*
		 * File[]listFiles()
		 * ��ȡ��ǰĿ¼�µ������������ÿһ��������
		 * һ��Fileʵ����ʽ�������飬�������鷵�ء�
		 */
		File[] subs=dir.listFiles();
		System.out.println(subs.length);
	for (int i = 0; i <subs.length; i++) {
		System.out.println(subs[i].getName());
	}
	}
}
}
