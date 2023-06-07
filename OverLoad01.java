package chapter07.method;

public class Overload01 {
	public static void main(String[] args) {
		Overload mc = new Overload();
		System.out.println(mc.Overload(1, 1));
		System.out.println(mc.Overload(2, 2.0));
		System.out.println(mc.Overload(3.0, 3));
		System.out.println(mc.Overload(4,4,4));
	}

}

class Overload {
	public int Overload(int a1, int b1) {
		System.out.println("int, int被调用bbbbbbb");
		//注意：
		return a1 + b1;
	} 
	public double Overload(int n1, double n2) {
		System.out.println("int double 被调用");
		return n1 - n2; 
	}
	public double Overload(double n1, int n2) { 
		System.out.println("double6"+ " int被调用.."); 
	return n1 * n2; 
	}
	public int Overload(int n1, int n2,int n3) {
		System.out.println("int int int 被调用");
		return n1 + n2 + n2; 
	} 
	
}









