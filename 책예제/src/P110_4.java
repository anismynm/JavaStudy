import java.util.Scanner;

public class P110_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (b < a && a < c) {
			System.out.println("중간 값은 " + a);
		}
		else if (c < a && a < b) {
			System.out.println("중간 값은 " + a);
		}
		else if (c < b && b < a) {
			System.out.println("중간 값은 " + b);
		}
		else if (a < b && b < c) {
			System.out.println("중간 값은 " + b);
		}
		else if (a < c && c < b) {
			System.out.println("중간 값은 " + c);
		}
		else if (b < c && c < a) {
			System.out.println("중간 값은 " + c);
		}
		else {
			System.out.println("중간 값을 찾을 수 없습니다.");
		}
		scan.close();
	}
	
}
