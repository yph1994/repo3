package collection;
/**
 * JDK5之后推出了一个特性：增强型For循环
 * 也称为新循环，for each
 * 新循环不取代传统For循环的工作，它仅用来遍历集合或数组使用
 * 并且新循环的语法是编译器认可的，而非虚拟机认可的。
 * @author Administrator
 *
 */
public class NewForDemo {
public static void main(String[] args) {
	String [] array ={"one","two","three","four","five"};
	for (int i = 0; i <array.length; i++) {
		String  str= array[i];
		System.out.println(str);
	}
	/*
	 *新循环会被编译器在编译时改为普通的for循环遍历
	 */
	for(String str:array){
		System.out.println(str);
	}
}
}
