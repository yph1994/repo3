package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 再异常处理机制中操作IO
 * @author Administrator
 *
 */
public class Demo3 {
	public static void main(String[] args) {

		FileOutputStream fos=null;
		try {
			fos= new FileOutputStream("fos.dat");
			fos.write(1);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
				fos.close();}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}


	}
}
