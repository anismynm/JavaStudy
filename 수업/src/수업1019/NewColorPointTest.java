package 수업1019;
//class, main 파일들 따로따로
public class NewColorPointTest {

	public static void main(String[] args) {
		Point oPoint;
		oPoint = new Point(); //point class의 기본 생성자를 생성. (기본 생성자는 자동 생성이라 오류 안뜸)
		oPoint.set(1, 2); // 함수이름 시작은 소문자, 동사로 하기.
		oPoint.showPoint();
		
		ColorPoint oColorPoint;
		oColorPoint = new ColorPoint(3, 4, "RED");
		oColorPoint.set(3, 4); // 오류가 안나는 이유 : 상속받았기 떄문에 Point.set이 public 이라서
		oColorPoint.setColor("RED");
		oColorPoint.showColorPoint();
		
		String sObjMsg = oColorPoint.toString(); // class를 설명한다. (설명하는 코드) 모든 class에는 대부분 만들어준다. 
		System.out.println(sObjMsg);
	}

}

// 상속을 하는 이유, 상속의 장점, 클래스의 장점, 클래스를 쓰는 이유???? 그냥 개념들 왜 쓰는지, 장점은 무엇인지..
