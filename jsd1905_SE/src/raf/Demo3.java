package raf;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF��д�����������ݣ��Լ�����ָ��Ĳ���
 * RAF������ָ�뵱ǰλ�û����д�����Ҷ�д��Ϻ�
 * ָ�������ƶ����Ա��´ζ�д����
 * @author Administrator
 *
 */
public class Demo3 {
public static void main(String[] args) throws IOException {
	 RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
	 /*
	  * long getFilePoint()
	  * ���ص�ǰRAF��ָ��λ��
	  */
	long pos= raf.getFilePointer();
	System.out.println("pos:"+pos);//0
		/*
		 * ��raf.dat�ļ���д��һ��int���ֵ
		 * 01111111 11111111 11111111 11111111
		  	>>>:λ������
		  	���������ֶ�Ӧ��2�������������ƶ�ָ��λ
		   max>>>24
		   00000000 00000000 00000000 01111111 
		   max>>>16
		   00000000 00000000 01111111 11111111 
		 */
	 int max=Integer.MAX_VALUE;
	 raf.write(max>>>24);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.write(max>>>16);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.write(max>>>8);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.write(max);
	 System.out.println("pos:"+raf.getFilePointer());
	 /*
	  * RAF�ṩ�˷���д�������������ݵķ���
	  * void writeInt��int i��
	  * ����д��4���ֽڣ���intֵд���ļ�
	  * �����������ͷ���Ҳ�У�
	  * void writeLong(long l)
	  * void writeDouble(double d)
	  * ...
	  */
	 raf.writeInt(max);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.writeLong(123L);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.writeDouble(123.123);
	 System.out.println("pos:"+raf.getFilePointer());
	 /*
	  * void seek(long pos);
	  * ��ָ���ƶ���ָ��λ��
	  */
	 raf.seek(0);
	/*
	 * int readInt������
	 * ������4���ֽڣ���intֵ����
	 */
	 int d= raf.readInt();
	 System.out.println(d);
	 System.out.println("pos:"+raf.getFilePointer());
	 //��ȡlongֵ
	 raf.seek(8);
	 long lon=raf.readLong();
	 System.out.println(lon);
	 System.out.println("pos:"+raf.getFilePointer());
	 /*
	  * �޸��ļ�����
	  * ���磺��long��ֵ��Ϊ5678
	  * �������ߣ�
	  * 1.���Ƚ�ָ���Ƶ�long����λ��
	  * 2.���½�����������д��(8���ֽ�)����
	  * ���Ǽ���
	  */
	 raf.seek(8);
	 raf.writeLong(5678);
	 System.out.println("pos:"+raf.getFilePointer());
	 raf.seek(8);
	lon= raf.readLong();
	 System.out.println(lon);
	 raf.close();
}
}
