//统计 1---200 之间能被 5 整除但不能被 3 整除的个数 (DoWhile01.java)
//(1) 使用 do-while 输出 1-200 
//(2) 过滤 能被 5 整除但不能被 3 整除的数 % 
//(3) 统计满足条件的个数 int count = 0; //先死后活 
//(1) 范围的值 1-200 你可以做出变量 
//(2) 能被 5 整除但不能被 3 整除的 , 5 和 3 可以改成变量
public class DoWhile01 {
	public static void main(String[] args) {
		int i = 1;
		int count = 0;
		do {
			if(i % 5 == 0 && i % 3 != 0) 
			{System.out.println("i=" + i);}
			i++;
			count++;
		}
		while(i <= 200);
		System.out.println("count=" + count);
	}
}