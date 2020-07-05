package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 缓冲字符输入流，java.io.BufferedReader
 * 特点：
 * 提高读取文本数据效率（块读），还可以按行读取字符串
 * @author Administrator
 *
 */
public class BRDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 将当前程序源代码读取出来，按行输出到控制台上
		 */
		FileInputStream fis= new FileInputStream("src/io/BRDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line =null;
		/*
		 * String readLine()
		 * 缓冲字符输入流提供的独有方法，该方法来
		 * 一次性读取一行字符串。一行结束的标志是读取
		 * 到换行符，但是返回的字符串中不含有最后的换行符
		 * 若返回值为null，则表示流读取到了末尾
		 * 如果某一行只有换行符，返回值为空字符串。
		 * 
		 */
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}

}
