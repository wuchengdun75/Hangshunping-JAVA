package com.hspedu.static_;

public class VisitStatic {
	public static void main(String[] args) {
		AA a = new AA();
		System.out.println("AA类的name " + a.name);
		System.out.println("AA类的name 类变量/静态变量访问  " + AA.name);
	}

}

class AA {
	public static String name = "韩顺平教育";
	
}
