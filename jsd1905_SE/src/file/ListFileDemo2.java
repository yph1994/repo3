package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录下符合条件的所有子项
 * @author Administrator
 *
 */
public class ListFileDemo2 {
public static void main(String[] args) {
	/*
	 * 获取当前目录下名字以"."开头的子项
	 */
	File dir=new File(".");
	FileFilter filter=new FileFilter(){
		/**
		 * 定义过滤条件
		 * 当参数file符合过滤条件时，当前方法应当返回为true
		 * 否则返回false
		 */
	
		public boolean accept(File file) {
			String name=file.getName();
			return name.startsWith(".");
		}
	};
	/*
	 * File[]listFiles(FileFilter filter)
	 * 将当前File表示的目录中符合给定过滤器要求的所有子项返回
	 * 获取过程中，目录下的所有子项都会经过一次过滤器的accept方法
	 * 但仅该方法返回值为true的子项被保留并进行返回
	 */
	File [] fs=dir.listFiles(filter);
	for (int i = 0; i < fs.length; i++) {
		System.out.println(fs[i].getName());
	}
}
}


