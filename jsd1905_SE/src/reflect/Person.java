package reflect;

public class Person {
public void sayHello(){
	System.out.println("person:hello!");

}
public void sayHi(){
	System.out.println("person:hi!");
}
public void say(String name){
	System.out.println("person:大家好，我是"+name);
}
public void say(String name,int age){
	System.out.println("person:大家好，我是"+name+",今年："+age+"岁");
}
}
