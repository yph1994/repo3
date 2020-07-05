package collection;

import java.util.ArrayList;
import java.util.Collection;

import javax.print.DocFlavor.STRING;

/**
 * 
 * 
 */
public class Demo {
public static void main(String[] args) {
	
	String str= "hello";
    int a=3;
    Point p=new Point(1, 2);
    Collection c=new ArrayList();
    c.add(p);
    test(a,str,p,c);
	System.out.println(a);
	System.out.println(str);
	System.out.println(p);
	System.out.println(c);
	
}
public static void test(int a,String str,Point p,Collection c){
	a++;
	str +="world";
	p.setX(3);
	p=new Point(a, 6);
	c.add(p);
	c=new ArrayList();
	c.add(p);
	p.setX(7);
	c.clear();
	c.add(new Point(8, 9));	
};

}

