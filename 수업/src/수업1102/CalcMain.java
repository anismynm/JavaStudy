package 수업1102;

public class CalcMain {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6};
		GoodCalc c = new GoodCalc(); // 슈퍼 클래스는 객체 생성 안됨 !
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(3, 2));
		System.out.println(c.average(a));
		
	}

}
