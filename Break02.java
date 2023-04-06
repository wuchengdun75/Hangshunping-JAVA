//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，
//请使用 for+break 完成
// 1. 创建 Scanner 对象接收用户输入
// 2. 定义 String name ; String passwd; 保存用户名和密码 
// 3. 最多循环 3 次[登录 3 次]，如果 满足条件就提前退出 
// 4. 定义一般变量 int chance 记录还有几次登录机会 change--；
import java.util.Scanner;
public class Break02{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int change = 3;
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入你的用户名");
			name = myScanner.next();
			System.out.println("请输入你的密码哦");
			password = myScanner.next();
			if("丁真".equals(name) && "123".equals(password)) {
				System.out.println("用户名及密码正确，登录成功");
				break;
			}
			change--;
			System.out.println("你还有"+ change+ "次机会");
		}
	}
}