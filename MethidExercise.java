public class MethidExercise {
    public static void main(String[] args) {
    	Ahhhh a = new Ahhhh();
    	
    	a.print(20, 25, '#');
    }
}
class Ahhhh {
	public void print(int row, int col, char c) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}