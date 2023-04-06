//实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，
import java.util.Scanner;
public class Cs{
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int change = 3;
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入你的用户名");
			name = myScanner.next();
			if("丁真".equals(name)) {
				System.out.println("请输入你的密码哦");}
				password = myScanner.next();
			  if("123".equals(password)) {
				  System.out.println("密码正确，登录成功");}
			  
			change--;
			System.out.println("你还有"+ change+ "次机会");
		}
	}
}