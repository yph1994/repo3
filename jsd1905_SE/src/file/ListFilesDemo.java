package file;

import java.io.File;

/**
 * 获取一个目录中的所有内容
 * @author Administrator
 *
 */
public class ListFilesDemo {
public static void main(String[] args) {
	/*
	 * 获取当前目录下的所有内容
	 */
	File dir =new File(".");
	/*
	 * 判断当前file表示的是否为文件
	 * boolean isFile();
	 * 判断当前file表示的是否为目录
	 * boolean isDirectory();
	 */
	if(dir.isDirectory()){
		/*
		 * File[]listFiles()
		 * 获取当前目录下的所有子项，并将每一个子项以
		 * 一个File实例形式存入数组，并将数组返回。
		 */
		File[] subs=dir.listFiles();
		System.out.println(subs.length);
	for (int i = 0; i <subs.length; i++) {
		System.out.println(subs[i].getName());
	}
	}
}
}
