
public class CircleArray {
	
	public static void main(String[] args) {
		Circle[] cArray;
		cArray = new Circle[5];
		int iRadius;
		double dArea;
		
		for (int i = 0; i < cArray.length; i ++) {
			iRadius = i + 5;
			cArray[i] = new Circle(iRadius);
		}
		
		for (int i = 0; i < cArray.length; i ++) {
			dArea = cArray[i].getArea();
			System.out.println(dArea);
		}
	}
	
}
