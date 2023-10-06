import java.util.Scanner;

public class Bpg159_OC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("수를 결정하였습니다. 맞추어보세요.");
			int iAnswer = (int)(Math.random() * 99);
			int iMin = 0;
			int iMax = 99;
			int iCnt = 1;
			while (true) {
				System.out.println(iMin+"~"+iMax);
				System.out.print(iCnt+">> ");
				int iInput = scan.nextInt();
				if (iInput > iAnswer) {
					System.out.println("더 낮게");
					iMax = iInput;
					iCnt++;
				}
				else if (iInput < iAnswer) {
					System.out.println("더 높게");
					iMin = iInput;
					iCnt++;
				}
				else {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.print("다시하겠습니까? (y/n)>> ");
			String iRe = scan.next();
			char cRe = iRe.charAt(0);
			if (cRe == 'n') {
				break;
			}
		}
		
		scan.close();
	}

}
