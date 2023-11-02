package 수업1102;

public class GoodCalc extends Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public int substract(int a, int b) {
		return a - b;
	}

	public double average(int[] a) {
		int sum = 0; // 합은 어차피 정수니까 타입 정수형으로 - 더블형 써도 상관없지만 프로그램의 확장성을 위해서
		for (int i = 0; i < a.length; i ++) {
			sum += a[i];
		}
		double result = (double)sum / a.length; // 캐스트 연산자 쓰기 안쓰면 소수점 절삭됨
		return result;
	}
}
