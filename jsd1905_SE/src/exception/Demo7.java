package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ��������д����һ������throws�����쳣�׳��ķ���ʱ
 * ��throws����д����
 * 
 * @author Administrator
 *
 */
public class Demo7 {
public void  dosome()
	throws IOException,AWTException{
		
	}

}
class Son extends Demo7{
//	public void  dosome()
//			throws IOException,AWTException{
//				
//			}
//	public void  dosome()  �׳������쳣
//			throws IOException{
//				
//			}
//	public void  dosome(){ ���Բ��׳��κ��쳣
//	
//		
//	}
	
	public void  dosome()//�����׳����෽���׳��쳣���������쳣
	throws FileNotFoundException{
		
	}
//	�������׳������쳣
//	public void dosome()
//		throws SQLException{
//	}
//	�������׳����෽���׳��쳣�ĳ����쳣
//	public void dosome()
//	throws Exception{
//}
}
