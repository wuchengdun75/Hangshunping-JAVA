public class OverLoad01 {
	public static void main(String[] args) {
		MyCalculator ma = new MyCalculator();
 
		System.out.println(ma.calculate(1,2));
		
	}
}

class MyCalculator {
	public int calculate(int n1,int n2);{
	return n1 + n2;
	}
	
	public double calculate(int n2,double n1);{
		return n2 + n1;
		}
	
}