package com.hspedu.static_;

public class StaticMethod {
	public static void main(String[] args) {
		
		Stu tom = new Stu("tom");
		tom.PayFee(200);
		Stu mary = new Stu("mary");
		mary.PayFee(300);
		
		Stu.showFee();
		
	}

}
class Stu {
	public String name;
	public static double Fee = 0;
	
	public Stu(String name) {
		this.name = name;
	}
	
	public static void PayFee(double fee) {
		Stu.Fee += fee;
	}
	
	public static void showFee() {
		System.out.println("所有学生的总学费为 " + Stu.Fee);
	}
}
