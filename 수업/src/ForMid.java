// 입력값은 맨 아래층 별 개수, 입력값이 홀수일때만 작동
import java.util.Scanner;

public class ForMid {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("입력 (종료 : 0) >> ");
			int iInput = scan.nextInt();
			int iRow = (iInput / 2) + 1;
			if (iInput % 2 == 1) {
				for (int i = 0; i < iRow; i ++) {
					for (int j = 0; j < iRow - i - 1; j ++) {
						System.out.print("  ");
					}
					for (int k = 0; k < 2 * i + 1; k ++) {
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else if (iInput == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			else {
				System.out.println("홀수입력!!");
			}
		}
		scan.close();
	}
}
