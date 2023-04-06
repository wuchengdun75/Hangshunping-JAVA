public class Continue {
	public static void main(String[] args) {
		
		label1:
			for(int j = 0; j < 2; j++) {
				
				label2:
				for(int i = 0; i < 10; i++) {
				if(j == 2) {
					continue label1;
				}
				System.out.println("i=" + i);
				}
			}
	}
}