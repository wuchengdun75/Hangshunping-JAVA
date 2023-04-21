public class Recursion03 {
	public static void main(String[] args) {
		Ta a2 = new Ta();
		int day = 1;
		
		int peachNum = a2.peach(day);
		if(peachNum != -1) {
			System.out.println("第多少天有" + peachNum + "个桃子");
		}
	}
}

class Ta {
	public int peach(int day) {
		if(day == 10) {
			return 1;
		}
		else if (day >= 1 && day <= 9) {
			return (peach(day + 1) + 1) * 2;
		}
		else {
			System.out.println("day在1-10之间");
			return -1; 
		}
	}
}