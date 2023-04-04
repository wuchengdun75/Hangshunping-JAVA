//打印 1—100 之间所有能被 3 整除的数 [使用 while,
public class WhileExercise {
	public static void main(String[] args) {
		int i = 1;
		int endNum = 100;
		while(i <= endNum) {
			if(i % 3 == 0) {System.out.println("i=" + i);}
			i++;
		}
		
	}
}