package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����ֻ�ܴ����������Ԫ�أ����ұ����Ҳ��Ԫ�ص����ã���ַ��
 * @author Administrator
 *
 */
public class CollectionDemo5 {
public static void main(String[] args) {
	Collection c=new ArrayList();
	Point p =new  Point(1, 2);
    c.add(p);
    System.out.println("p"+p);//(1,2)
    System.err.println("c"+c);//[(1,2)]
    p.setX(2);
    System.out.println("p"+p);//(2,2)
    System.err.println("c"+c);//[(2,2)]
    
}
}
