public class OverLoad02 {
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(100);
		method.m(10,20);
		method.m("韩顺平教育");
		System.out.println(method.max(10,24));
		System.out.println(method.max(10.0, 21.3));
		System.out.println(method.max(10.4, 24.1, 43.0));
		System.out.println("没有发生自动类型转换的数据类型，优先级更高");
	}
}
class Methods {
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	public double max(double n1, double n2, int n3) {
		System.out.println("int数据类型");
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
	public double max(double n1, double n2, double n3) {
		System.out.println("double数据类型" );
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
	
	public void m(int n) {
		System.out.println("平方=" + (n * n));
	}
	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 + n2));
	}
	public void m(String str) {
		System.out.println("传入的str=" + str );
	}
}