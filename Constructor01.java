package chapter07.method;

public class constructor01 {
	public static void main(String[] args) {
		
		Person2 p11 = new Person2("smith", 80);
		System.out.println("p1 的信息如下");
		System.out.println("p1对象name=" + p11.name);
		System.out.println("p1对象gae=" + p11.age);
	}

}

class Person2 {
	String name;
	int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	
	
}