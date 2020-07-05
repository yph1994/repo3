package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK1.7以后推出了一个特性：自动关闭Autocloseable
 * 流都实现了Autocloseable接口
 */
public class Demo4 {
	public static void main(String[] args) {
		try (	
				FileOutputStream fos= new FileOutputStream("fos.dat");
				/*
				 * 只有实现了AutoCloseable接口的类可以在
				 * 这里定义并初始化，像流和RandomAccessFile都实现了该接口
				 * 被定义在这里的内容会被编译器最终改为在finally中关闭，
				 * 改后代码类似Demo3.java
				 */
		)
		{
			fos.write(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
