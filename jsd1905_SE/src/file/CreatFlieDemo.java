package file;

import java.io.File;
import java.io.IOException;

/*
 * ʹ��File����һ���ļ�
 */
public class CreatFlieDemo {
public static void main(String[] args) throws IOException {
	/*
	 * �ڵ�ǰĿ¼�´���һ���ļ�demo.txt
	 */
	File file = new File ("./demo.txt");
	//�ж�File��ʾ���ļ���Ŀ¼�Ƿ��Ѿ�����
	if(!file.exists()){
		file.createNewFile();//����file����ʾ���ļ�
		System.out.println("�ļ��Ѵ���");
	}
	else{
		System.out.println("�ļ��Ѵ���");
	}
}
}
