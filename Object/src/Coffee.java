import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		int iEsp = 1500;
		int iAme = 2000;
		int iLatte = 2500;
		int iIce = 3000;
		int iSum = 0;
		System.out.println("=====MENU=====");
		System.out.println("1. 에스프레소: 1500원");
		System.out.println("2. 아메리카노: 2000원");
		System.out.println("3. 라떼: 2500원");
		System.out.println("4. 아이스아메리카노: 3000원");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("메뉴를 입력하세요 (주문을 끝내려면 0을 입력): ");
			int oInput = scanner.nextInt();
			if (oInput == 0) {
				break; // '반복문'에서 벗어나는 것이니까 if는 상관없음.
			}
			switch (oInput) {
			case 0:
				break;
			case 1:
				System.out.println("에스프레소 주문");
				iSum += iEsp;
				break;
			case 2:
				System.out.println("아메리카노 주문");
				iSum += iAme;
				break;
			case 3:
				System.out.println("라떼 주문");
				iSum += iLatte;
				break;
			case 4:
				System.out.println("아이스아메리카노 주문");
				iSum += iIce;
				break;
			default:
				System.out.println("올바른 메뉴를 입력하세요.");
			}
		}
		System.out.println("=================");
		System.out.println("총 매출: " + iSum);
		scanner.close();
	}
}
