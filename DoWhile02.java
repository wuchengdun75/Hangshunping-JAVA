//如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止 
//[System.out.println("老韩问：还钱吗？y/n")]
//do...while .. DoWhileExercise02.java
//化繁为简 //(1) 不停的问还钱吗? 
//(2) 使用 char answer 接收回答, 定义一个 Scanner 对象 
//(3) 在 do-while 的 while 判断如果是 y 就不在循环
import java.util.Scanner;
public class DoWhile02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		
		do {System.out.println("老韩问：你还钱吗？ y/n");
		System.out.println("不还钱，老韩一直使用五连鞭。");
		answer = myScanner.next().charAt(0);
		System.out.println("他的回答是" + answer);
		}
		while(answer != 'y');
		System.out.println("李三还钱了");
		
	}
}









