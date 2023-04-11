//它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。 
//请问这六只鸡的总体重是多少?平均体重是多少?

public class Array01 {
	public static void main(String[] args) {
		double[] hens = {3, 5, 1, 3.4, 2, 50};
		System.out.println("数组的长度用这表示:hens.length" + hens.length);
		double totalWeight = 0;
		for(int i = 0; i < hens.length; i++) {
			System.out.println("第" + (i+1) + "个的值" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + "\n" +
				"平均体重=" + totalWeight/hens.length );
	}	
}