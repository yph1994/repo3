package file;

import java.io.File;

/**
 * 使用File删除一个已有文件
 */
public class DeleteFileDemo {
public static void main(String[] args) {
	/*
	 * 将当前目录下的demo.txt文件删除
	 * "./"是可以忽略不写的，默认就在当前目录
	 */
	File file =new File("demo.txt");
	if(file.exists()){
		file.delete();
		System.out.println("文件已删除");
	}else{
		System.out.println("文件不存在！");
	}
}
}
