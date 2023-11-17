interface Shape {
	final double PI = 3.14; // 상수 
	void draw(); // 도형 그리는 추상 메소드 
	double getArea(); // 도형 면적 리턴하는 추상 메소드 
	default public void redraw() { // 그림을 다시 그리는 디폴트 메소드 
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape {
	private int iRadius;
	
	public Circle(int iRadius) {
		this.iRadius = iRadius;
	}
	
	public void draw() {
		System.out.println("반지름이 " + iRadius + "인 원입니다.");
	}
	
	public double getArea() {
		return PI * iRadius * iRadius;
	}
	
	
}

public class Bpg321_Q13 {

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 " + donut.getArea());
	}
}