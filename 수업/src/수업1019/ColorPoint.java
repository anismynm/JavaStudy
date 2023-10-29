package 수업1019;

public class ColorPoint extends Point {
	private String sColor; // java는 String, c++은 string
	// 기본 생성자 만들기.
	public ColorPoint() {
		sColor = ""; // 클래스 변수 초기화
	}
	
	public ColorPoint(int x, int y, String sColor) {
		super(x, y); // 부모 클래스의 매개 변수 2개 갖는 생성자를 선택함.
		this.sColor = sColor;
	}
	
	public void setColor(String sColor) {
		this.sColor = sColor;
	}
	
	public void showColorPoint() {
		System.out.print(sColor); // 부모 클래스의 private 변수라서 오류. -> 그냥 직접 쓰지말고 부모 클래스에 있는 출력하는 멤버 이용하기. 
		showPoint();								// OR Get, Set 함수 부모 클래스에 구현 (접근 지정자 고치고 이런거 XXX)
	} 
	
	public String toString() {
		String sReturn = "<여기는 class를 설명하는 문장이 들어감>";
		return sReturn;
	}
}
