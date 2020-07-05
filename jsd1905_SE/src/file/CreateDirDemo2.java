package file;

import java.io.File;

/**
 * 创建多级目录
 * @author Administrator
 *
 */
public class CreateDirDemo2 {
public static void main(String[] args) {
	/*
	 * 在当前目录下新建一个："./a/b/c/d/e/f"目录
	 */
	File  dir =new File("./a/b/c/d/e/f");
	if(!dir.exists()){
	dir.mkdirs();
	System.out.println("目录已创建！");

	}else{
		System.out.println("目录已存在！");
	}
}
}
