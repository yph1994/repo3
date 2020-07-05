package file;

import java.io.File;

/**
 * 使用File创建一个目录
 * @author Administrator
 *
 */
public class CreateDirDemo {
public static void main(String[] args) {
	/*
	 * 在当前目录下新建一个名为demo的目录
	 */
	File dir= new File("demo");
	if (!dir.exists()){
		dir.mkdirs();//创建该目录
	}else{
		System.out.println("该目录已存在！");
	}
}
}
