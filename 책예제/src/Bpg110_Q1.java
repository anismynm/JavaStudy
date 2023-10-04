import java.util.Scanner;

public class Bpg110_Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위:원) ");
		int iWon = scan.nextInt();
		double dollar = (double)iWon/1100;
		System.out.println(iWon + "원은 $" + dollar + "입니다.");
		scan.close();

	}

}
