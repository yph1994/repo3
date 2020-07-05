package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓存流提高读写效率
 * @author Administrator
 *缓冲流:
 *java.io.BufferedInputStream
 *java.io.BufferedOutputStream
 *缓存流是一对高级流，功能为提高读写效率
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
		System.out.println("复制完毕！耗时："+(end-start)+"ms");
		bis.close();
		bos.close();
	}
}
