//1-100 以内的数求和，求出 当和 第一次大于 20 的当前数 【for + break】
//思路分析 
//1. 循环 1-100, 求和 sum 
//2. 当 sum > 20 时，记录下当前数，然后 break 
//3. 在 for 循环外部，定义变量 n , 把当前 i 赋给 n

public class Break01 {
	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		for(int i = 1; i <= 100; i++ ) {
			sum += i;
			if(sum > 40) {
				System.out.println("1-100的数累计求和>40,累加到多少break：" +   i);
				n = i;
				break;
			}
		}
		System.out.println("v" +   n);
	}
}