package file;

import java.io.File;

/**
 * java.io.File
 * 该类的每一个实例用于表示文件系统上的一个文件或目录
 * 我们使用它可以
 * 1.访问文件或目录的属性信息（文件名，修改时间等）
 * 2.创建或删除文件，目录
 * 3.访问一个目录中的所有子项
 * 但是不能访问一个文件的数据
 * @author Administrator
 *
 */
public class FileDemo1 {
public static void main(String[] args) {
	/*
	 * 创建File时指定的路径通常用相对路径
	 * 这样做的好处是跨平台无需修改
	 * “/.”表示当前目录，而当前目录具体是哪里
	 * 要看当前java程序的运行环境而定
	 * 对应在eclipse下执行时，当前目录指的就是
	 * 当前程序所在项目目录，比如：jsd1905_SE
	 */
	File file =new File("./test.txt");
	//获取文件名
	String name =file.getName();
	System.out.println(name);
	//获取文件大小（单位为字节）
	long length =file.length();
	System.out.println(length+"字节");
	
	boolean cw=file.canRead();
	boolean cr=file.canWrite();
	System.out.println("可写:"+cw);
	System.out.println("可读:"+cr);
	
	boolean ih = file.isHidden();
	System.out.println("是否隐藏"+ih);
}
}
