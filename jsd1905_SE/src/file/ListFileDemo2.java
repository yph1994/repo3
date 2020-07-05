package file;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡһ��Ŀ¼�·�����������������
 * @author Administrator
 *
 */
public class ListFileDemo2 {
public static void main(String[] args) {
	/*
	 * ��ȡ��ǰĿ¼��������"."��ͷ������
	 */
	File dir=new File(".");
	FileFilter filter=new FileFilter(){
		/**
		 * �����������
		 * ������file���Ϲ�������ʱ����ǰ����Ӧ������Ϊtrue
		 * ���򷵻�false
		 */
	
		public boolean accept(File file) {
			String name=file.getName();
			return name.startsWith(".");
		}
	};
	/*
	 * File[]listFiles(FileFilter filter)
	 * ����ǰFile��ʾ��Ŀ¼�з��ϸ���������Ҫ������������
	 * ��ȡ�����У�Ŀ¼�µ���������ᾭ��һ�ι�������accept����
	 * �����÷�������ֵΪtrue��������������з���
	 */
	File [] fs=dir.listFiles(filter);
	for (int i = 0; i < fs.length; i++) {
		System.out.println(fs[i].getName());
	}
}
}


