		package 수업1019;

public class Point {
	// 기본 생성자 만들기 (안만들면 감점)
	// default 접근지정자 사용 XXX, 기본적으로 private으로 만들기
	private int x;
	private int y; //이왕이면 따로 쓰기.
	
	public Point() { // 기본 생성자
		x = 0;
		y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
 	
	public void setX(int x) { // 이건 수정도 가능. GETSET함수  자식 클래스에서 부모 클래스의 private 함수에 접근할 수 있기 위함.
		this.x = x;
	}
	
	public void setY(int y) { // 이건 수정도 가능. GETSET함수 
		this.y = y;
	}
	
	public void set(int x, int y) { // 객체에서 호출해야되니까 접근 지정자 public
		this.x = x; 	// c++은 ->, java는 .
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}
