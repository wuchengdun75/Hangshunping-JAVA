import java.util.Scanner;

public class Ifelse {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();
		
		if(age > 18) {
			System.out.println("年龄大约18，则要判刑，送入监狱。");
			System.out.println("if程序结束.........");}
		else {System.out.println("年龄小于18，放过你吧。");}
		
	}
}