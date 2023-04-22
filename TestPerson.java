public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("tom" , 20);
		Person p2 = new Person("jack" , 27);
		
		Person p3 = new Person("jack" , 27);
		Person p4 = new Person("jack" , 27);
		
		System.out.println(p1.compareTo(p2));
		System.out.println("\n");
		System.out.println(p3.compareTo(p4));
		
	}
}
class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;		
	}
	public boolean compareTo(Person p) {
		return this.name.equals(p.name) && this.age ==p.age;
	}
}