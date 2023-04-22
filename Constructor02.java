public class Constructor02 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println("p1的信息name=" +  p1.name 
				+ "\t" + "age=" + p1.age);
		Person1 p2 = new Person1("tom", 40);
		System.out.println("p2的信息name=" +  p2.name 
				+ "\t" + "age=" + p2.age);
		}
}

class Person1{
	String name;
	int age;
	
	public Person1() {
		age = 18;
	}//构造器
	
	public Person1(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}
