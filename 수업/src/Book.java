
public class Book {
	private String sName;
	private String sMaker;
	
	public Book(String sName) {
		this(sName, "작자 미상"); // 본 객체의 생성자를 호출. 무조건 문장 맨 앞에 와야 함.
	}
	
	public Book(String sName, String sMaker) {
		this.sName = sName;
		this.sMaker = sMaker;
	}
	
	public void PrintInfo() {
		System.out.println("책 이름: " + sName + ", 저자: " + sMaker);
	}
}
