import java.util.Scanner;

public class Bpg110_Q5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			System.out.println("삼각형이 됩니다.");
		}
		else {
			System.out.println("삼각형이 안됩니다.");
		}
		scan.close();
	}
	
}
