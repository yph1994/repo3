package raf;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及基于指针的操作
 * RAF总是在指针当前位置或读或写，并且读写完毕后
 * 指针会向后移动，以备下次读写操作
 * @author Administrator
 *
 */
public class Demo3 {
public static void main(String[] args) throws IOException {
	 RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
	 /*
	  * long getFilePoint()
	  * 返回当前RAF的指针位置
	  */
	long pos= raf.getFilePointer();
	System.out.println("pos:"+pos);//0
		/*
		 * 向raf.dat文件中写入一个int最大值
		 * 01111111 11111111 11111111 11111111
		  	>>>:位移运算
		  	将给定数字对应的2进制整体向右移动指定位
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
	  * RAF提供了方便写出基本类型数据的方法
	  * void writeInt（int i）
	  * 连续写出4个字节，将int值写入文件
	  * 其他基本类型方法也有：
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
	  * 将指针移动到指定位置
	  */
	 raf.seek(0);
	/*
	 * int readInt（）；
	 * 连续读4个字节，将int值返回
	 */
	 int d= raf.readInt();
	 System.out.println(d);
	 System.out.println("pos:"+raf.getFilePointer());
	 //读取long值
	 raf.seek(8);
	 long lon=raf.readLong();
	 System.out.println(lon);
	 System.out.println("pos:"+raf.getFilePointer());
	 /*
	  * 修改文件数据
	  * 例如：将long的值改为5678
	  * 分两步走：
	  * 1.首先将指针移到long所在位置
	  * 2.重新将新数据内容写入(8个字节)进行
	  * 覆盖即可
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
