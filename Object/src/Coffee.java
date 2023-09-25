import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		int iSum = 0;
		int iCoffeeCnt[] = {0, 0, 0, 0};
		int iPrice[] = {1500, 2000, 2500, 3000};
		String sName[] = {"에스프레소", "아메리카노", "라떼", "아이스아메리카노"};
		System.out.println("=====MENU=====");
		System.out.println("0. 매출 출력");
		System.out.println("1. 에스프레소: 1500원");
		System.out.println("2. 아메리카노: 2000원");
		System.out.println("3. 라떼: 2500원");
		System.out.println("4. 아이스아메리카노: 3000원");
		System.out.println("==============");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("메뉴를 입력하세요: ");
			int oInput = scanner.nextInt();
			if (oInput == 0) {
				System.out.println("===============");
				System.out.println("총 매출: " + iSum);
				System.out.println("==총 판매 수==");
				System.out.println("에스프레소: " + iCoffeeCnt[0]);
				System.out.println("아메리카노: " + iCoffeeCnt[1]);
				System.out.println("라떼: " + iCoffeeCnt[2]);
				System.out.println("아이스아메리카노: " + iCoffeeCnt[3]);
				System.out.println("===============");
				break;
			}
			else if (oInput == 1 || oInput == 2 || oInput == 3 || oInput == 4) {
				oInput--;
				System.out.println(sName[oInput] + "가 주문되었습니다.");
				iSum += iPrice[oInput];
				iCoffeeCnt[oInput]++;
			}
			else {
				System.out.println("올바른 메뉴를 입력하세요.");
			}
		}
		scanner.close();
	}
}
