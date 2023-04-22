public class This01 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮" , 5);
		dog1.info();
	}
}
class Dog {
	String name;
	int age;
	public Dog(String name, int age) {
		this.name = name;
		//this.name 就是指 当前对象的属性name
		this.age = age;
		//this.age ☞当前对象的属性age
	}
	public void info() {
		System.out.println(name + "\t" + age + "\t");
	}
	
}