public class MethodParameter {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Class ddd = new Class();
		ddd.swap(a,b);
		System.out.println("a=" + a  + "b=" + b );
		}
}	
class Class {
	public void swap(int a, int b) {
		System.out.println("a和b交换前a=" + a  + "b=" + b );
		int tmp = a;
		a = b;
		b = tmp;
		System.out.println("a和b交换后a=" + a  + "\n" + "b=" + b );
	}
}