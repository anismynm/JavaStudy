import java.util.Scanner;

public class Bpg165_Q4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오.>> ");
		String sInput = scan.next();
		char cInput = sInput.charAt(0);
		for (int i = (int)cInput; i >= 97; i --) { // 97 = 'a' (int)cInput : 문자 -> 숫자(아스키코드)
			for (int j = 97; j <= i; j ++) {
				char alp = (char)j; // 숫자(아스키코드) -> 문자
				System.out.print(alp);
			}
			System.out.println();
		}
		scan.close();
		
	}

}
