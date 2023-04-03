//根据用于指定月份， //打印该月份所属的季节。 
//3,4,5 春季 6,7,8 夏季 9,10,11 秋季 12, 1, 2 冬季 //[课堂练习, 提示 使用穿透 ]
//思路分析 1. 创建 Scanner 对象， 接收用户输入 
//2. 使用 int month 接收 
//3. 使用 switch 来匹配 ,使用穿透来完成，比较简洁

import java.util.Scanner;
public class dayinyuefeng {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份（1-12）"); 
		int mouth = myScanner.nextInt();
		switch(mouth) {
		case 3  : 
		case 4  : 	
		case 5  :
			System.out.println("这是春季");break;
		case 6  : 
		case 7  : 
		case 8  :
			System.out.println("这是夏季");break;
		case 9  : 
		case 10 : 
		case 11 :
			System.out.println("这是秋季");break;
		case 12 : 
		case 1  : 
		case 2  :
			System.out.println("这是冬季");break;
		default :
			System.out.println("输入有误。");
		}
	}
}