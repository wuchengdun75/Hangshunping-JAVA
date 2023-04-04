//3.2 当多重循环结束后，totalScore / (3 * 5) 
//(4) 统计三个班及格人数 
//4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60, passNum++ 
//4.2 如果 >= 60 passNum++ 
//(5) 可以优化[效率，可读性, 结构]

import java.util.Scanner;
public class ForFor2 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double totalscore = 0;
		int passNum = 0;
		// int classNum = 3;
		//int stuNum = 5;
		for(int j = 1; j <= 3; j++) {
			//j表示第几个班
			double sum = 0;
			for(int i = 1; i <= 5; i++) {//i表示每个班的学生
//System.out.println("请输入第" + j + "个班第" + i "个学生成绩");
			System.out.println("请数第"+j+"个班的第"+i+"个学生的成绩");
			 double score = myScanner.nextDouble();
			 if(score >= 60) {passNum++;}
			 
			 sum += score;
			System.out.println("成绩是" + score);
			totalscore += sum;
		}
		
		System.out.println("sum=" + sum + "平均分=" + (sum/5));
		}
		System.out.println("3个班的成绩总分=" + totalscore 
				+ "\n" + "3个班的平均分=" + (totalscore/15));
		System.out.println("及格人数" + passNum);
	}
}