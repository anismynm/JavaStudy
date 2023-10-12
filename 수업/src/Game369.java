//컴퓨터공학전공 2학년

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		Scanner oInput;
		int iNum, iMod;
		
		System.out.print("1~999 사이의 정수를 입력하세요: ");
		oInput = new Scanner(System.in);
		iNum = oInput.nextInt();
		if (iNum > 0 && iNum < 1000) {
			System.out.print("박수");
			while (iNum > 0) {
				iMod = iNum % 10;
				if (iMod == 3 || iMod == 6 || iMod == 9) {
					System.out.print("짝");			
				}
				iNum /= 10;
			}
		}
		else {
			System.out.println("1 ~ 999 사이의 숫자가 아닙니다!");
		}
		oInput.close();
	}

}
