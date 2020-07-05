package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK1.7�Ժ��Ƴ���һ�����ԣ��Զ��ر�Autocloseable
 * ����ʵ����Autocloseable�ӿ�
 */
public class Demo4 {
	public static void main(String[] args) {
		try (	
				FileOutputStream fos= new FileOutputStream("fos.dat");
				/*
				 * ֻ��ʵ����AutoCloseable�ӿڵ��������
				 * ���ﶨ�岢��ʼ����������RandomAccessFile��ʵ���˸ýӿ�
				 * ����������������ݻᱻ���������ո�Ϊ��finally�йرգ�
				 * �ĺ��������Demo3.java
				 */
		)
		{
			fos.write(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
