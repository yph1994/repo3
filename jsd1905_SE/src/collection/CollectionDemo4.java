package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

/**
 * ���ϲ���
 * @author Administrator
 *
 */
public class CollectionDemo4 {
public static void main(String[] args) {
	Collection c1 = new ArrayList();
    c1.add("java");
    c1.add("c");
    c1.add("c++");
    c1.add("java");
    c1.add("java");
    
    System.out.println("c1"+c1);
    Collection c2 = new ArrayList();
    c2.add("php");
    c2.add(".net");
    c2.add("c++");
  /*
   * boolean addAll(Collection c)
   * ������������ ������Ԫ����ӵ���ǰ������
   */
    System.out.println("c2"+c2);
    c1.addAll(c2);
    System.out.println("c1"+c1);
    
    Collection c3 = new ArrayList();
    c3.add("java");
    c3.add(".net");
    c3.add("android");
    /*
     * boolean containsAll (Collection c)
     * �жϵ�ǰ�����Ƿ�������������е�����Ԫ��
     */
    boolean contains=c1.containsAll(c3);
    System.out.println("ȫ����"+contains);
    /*
     * boolean removeAll(Collection c)
     * ɾ����ǰ��������������ϵĹ���Ԫ��
     */
    c1.removeAll(c3);
    System.out.println("c1"+c1);
    System.out.println("c3"+c3);

}
}
