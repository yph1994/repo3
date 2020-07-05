package file;

import java.io.File;
import java.io.IOException;

/*
 * 使用File创建一个文件
 */
public class CreatFlieDemo {
public static void main(String[] args) throws IOException {
	/*
	 * 在当前目录下创建一个文件demo.txt
	 */
	File file = new File ("./demo.txt");
	//判断File表示的文件或目录是否已经存在
	if(!file.exists()){
		file.createNewFile();//创建file所表示的文件
		System.out.println("文件已创建");
	}
	else{
		System.out.println("文件已存在");
	}
}
}
