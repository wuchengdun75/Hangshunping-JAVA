public class FinalExercise01 {
	public static void main(String[] args) {
		
		Circle circle = new Circle(54);
		System.out.println("面积= " + circle.calArea());
	}
}
class Circle {
	private double radius;
	private final double PI;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	{
		PI = 3.1415;
	}
	public double calArea() {
		return PI * radius * radius;
	}
	
}