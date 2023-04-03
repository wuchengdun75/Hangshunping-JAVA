import java.util.Scanner;

public class Ifelseifelse1 {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入马保国的信用分（1-100）");
		int grade = myScanner.nextInt();
			if(grade >=1 && grade <=100);{
			//用if else判断输入的信用分在规定的范围内
				
				if(grade == 100) {
					System.out.println("信用分最好");}
				else if(grade > 80 && grade <=99) {
					System.out.println("信用分高");}
				else if(grade > 60 && grade <=80) {
					System.out.println("信用分一般");}
				else if(grade >= 40 && grade <=60) {
					System.out.println("信用分低");}
				else if(grade < 40) {System.out.println("信用分不及格");}
			
			else {
				System.out.println("输入的信用分不在1-100的范围内，请重新输入");}
			}
	}
}