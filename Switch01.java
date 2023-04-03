//请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g a 表示星期一，b 表示星期二 …
//思路分析 1. 接收一个字符 , 创建 Scanner 对象   2. 使用 switch 来完成匹配,并输出对应信息
//Scanner myScanner = new Scanner(System.in); 
//System.out.println("请输入一个字符(a-g)");
//char c1 = myScanner.next().charAt(0);

import java.util.Scanner;
public class Switch01 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符（a-f)");
		char c1 = myScanner.next().charAt(0);
		switch(c1) {
		case 'a': System.out.println("今天是星期一");
		break;
		case 'b': System.out.println("今天是星期二");
		break;
		case 'c': System.out.println("今天是星期三");
	    break;
		case 'd': System.out.println("今天是星期四");
	    break;
		case 'e': System.out.println("今天是星期五");
	    break;
	    default:System.out.println("今天是休息日");
		}
	}
}