package file;

import java.io.File;

/**
 * java.io.File
 * �����ÿһ��ʵ�����ڱ�ʾ�ļ�ϵͳ�ϵ�һ���ļ���Ŀ¼
 * ����ʹ��������
 * 1.�����ļ���Ŀ¼��������Ϣ���ļ������޸�ʱ��ȣ�
 * 2.������ɾ���ļ���Ŀ¼
 * 3.����һ��Ŀ¼�е���������
 * ���ǲ��ܷ���һ���ļ�������
 * @author Administrator
 *
 */
public class FileDemo1 {
public static void main(String[] args) {
	/*
	 * ����Fileʱָ����·��ͨ�������·��
	 * �������ĺô��ǿ�ƽ̨�����޸�
	 * ��/.����ʾ��ǰĿ¼������ǰĿ¼����������
	 * Ҫ����ǰjava��������л�������
	 * ��Ӧ��eclipse��ִ��ʱ����ǰĿ¼ָ�ľ���
	 * ��ǰ����������ĿĿ¼�����磺jsd1905_SE
	 */
	File file =new File("./test.txt");
	//��ȡ�ļ���
	String name =file.getName();
	System.out.println(name);
	//��ȡ�ļ���С����λΪ�ֽڣ�
	long length =file.length();
	System.out.println(length+"�ֽ�");
	
	boolean cw=file.canRead();
	boolean cr=file.canWrite();
	System.out.println("��д:"+cw);
	System.out.println("�ɶ�:"+cr);
	
	boolean ih = file.isHidden();
	System.out.println("�Ƿ�����"+ih);
}
}
