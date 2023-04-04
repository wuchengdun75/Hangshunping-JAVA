//统计 3 个班成绩情况，每个班有 5 名同学， 
//求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。 
//统计三个班及格人数，每个班有 5 名同学。

//(1) 先计算一个班 , 5 个学生的成绩和平均分 , 使用 for 
//1.1 创建 Scanner 对象然后，接收用户输入 
//1.2 得到该班级的平均分 , 定义一个 doubel sum 把该班级 5 个学生的成绩累积 
//(2) 统计 3 个班(每个班 5 个学生) 平均分 
//(3) 所有班级的平均分 //3.1 定义一个变量，double totalScore 累积所有学生的成绩 
//3.2 当多重循环结束后，totalScore / (3 * 5) 
//(4) 统计三个班及格人数 
//4.1 定义变量 int passNum = 0; 当有一个学生成绩>=60, passNum++ 
//4.2 如果 >= 60 passNum++ 
//(5) 可以优化[效率，可读性, 结构]
import java.util.Scanner;
public class ForFor {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		double totalscore = 0;
		for(int j = 1; j <= 3; j++) {//j表示第几个班
			double sum = 0;
		for(int i = 1; i <= 5; i++) {//i表示每个班的学生
//System.out.println("请输入第" + j + "个班第" + i "个学生成绩");
			System.out.println("请数第"+j+"个班的第"+i+"个学生的成绩");
			 double score = myScanner.nextDouble();
			 sum += score;
			System.out.println("成绩是" + score);
			totalscore += sum;
		}
		
		System.out.println("sum=" + sum + "平均分=" + (sum/5));
		}
		System.out.println("3个班的成绩总分=" + totalscore 
				+ "\n" + "3个班的平均分=" + (totalscore/15));
	}
}