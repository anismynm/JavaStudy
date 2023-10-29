
public class ForMidTerm {

	public static void main(String[] args) {
		// 일반 배열 생성
		int[] iArray = {4, 3, 2, 1, 0};
		System.out.println(iArray[0]);
		
		// OR
		// 선언부           생성부        그 밑에 초기화 
		int[] intArray = new int[5];
		for (int i = 0; i < 5; i ++) {
			intArray[i] = i;
		}
		System.out.println(intArray[0]);
		
		// 아무튼 생성을 했으면 반드시 초기화를 해줘야 한다 !!!!!!
		// C++에서는 *를 변수타입 뒤에, java에서는 []를 변수타입 뒤에 (외우는 법 : java는 Pointer가 없다 !!!!)
		// C++은 배열 선언 그냥 해도 되는데, java는 무조건 new를 써야 한다. but, delete는 안써도됨. (가비지 컬렉터)
		
		// 객체 배열 생성
		// 선언       생성(new)         그밑에 초기화를 해준다. 
		Book[] a = new Book[5];
		a[0] = new Book("홍길동전");
		a[1] = new Book("향연", "플라톤");
		a[2] = new Book("Computer System Architecture", "Mano");
		a[3] = new Book("명품 java 프로그래밍");
		a[4] = new Book("공학경제", "홍성조");
		
		for (int i = 0; i < 5; i ++) {
			a[i].PrintInfo();
		}
	}

}
