import java.util.Scanner;

public class Bpg110_Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("금액을 입력하세요> ");
		int iMoney = scan.nextInt();
		
		System.out.println("오만원권 " + iMoney / 50000 + "매");
		iMoney %= 50000;
		System.out.println("만원권 " + iMoney / 10000 + "매");
		iMoney %= 10000;
		System.out.println("천원권 " + iMoney / 1000 + "매");
		iMoney %= 1000;
		System.out.println("백원권 " + iMoney / 100 + "매");
		iMoney %= 100;
		System.out.println("오십원권 " + iMoney / 50 + "매");
		iMoney %= 50;
		System.out.println("십원권 " + iMoney / 10 + "매");
		iMoney %= 10;
		System.out.println("일원권 " + iMoney + "매");
		
		scan.close();
	}

}
