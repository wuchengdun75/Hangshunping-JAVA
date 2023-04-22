public class Constructor01 {
	public static void main(String[] args) {
		Person2 b1 = new Person2("king", 20);
		Person2 b2 = new Person2("Tom");
	}

	
}
class Person2 {
	String name;
	int age;
	public Person2(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
	public Person2(String pName) {
		name = pName;
	}
}