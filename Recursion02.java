public class Recursion02 {
	public static void main(String[] args) {
		Tabal t1 = new Tabal();
		System.out.println("当n=7 对于的斐波那契数是" + t1.fibonacci(7 ));
	}
}

class Tabal {
	public int fibonacci(int n) {
		if(n >= 1) {
			if(n==1 || n==2) {
				return 1;
			}
			else {
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}
		else {
			System.out.println("请输入n>=1的整数数列");
			return -1;
		}
	}	
}