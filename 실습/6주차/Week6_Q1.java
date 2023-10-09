import java.util.Scanner;

public class Week6_Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = null;
		
		while (true) {
			try {
				System.out.print("숫자 입력 (종료:q) >> ");
				input = scan.next();
				System.out.println(input + " + 54 : " + (Integer.parseInt(input) + 54));
			}
			catch(NumberFormatException e) {
				if (input.equals("q")) {
					break;
				}
				else {
					System.out.println("문자가 아닌 숫자를 입력할 것");
				}
			}
		}
		scan.close();
	}

}
