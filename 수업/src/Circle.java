
public class Circle {
	int iRadius;
	
	public Circle() {
		this(0);
	}
	
	public Circle(int iRadius) {
		this.iRadius = iRadius;
	}
	
	public double getArea() {
		return 3.14 * iRadius * iRadius;
	}
}
