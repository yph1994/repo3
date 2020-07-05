package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û�������߶�дЧ��
 * @author Administrator
 *������:
 *java.io.BufferedInputStream
 *java.io.BufferedOutputStream
 *��������һ�Ը߼���������Ϊ��߶�дЧ��
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		int len =0;
		FileInputStream pis= new FileInputStream("tts9.zip") ;
		BufferedInputStream bis =new BufferedInputStream(pis);
		FileOutputStream pos= new FileOutputStream("tts91.zip") ;
		BufferedOutputStream bos =new BufferedOutputStream(pos);
		byte[] data=new byte[10*1024];

		long start=System.currentTimeMillis();
		while((len=pis.read(data))!=-1){
			pos.write(data, 0, len);
		}
		long end=System.currentTimeMillis();
		System.out.println("������ϣ���ʱ��"+(end-start)+"ms");
		bis.close();
		bos.close();
	}
}
