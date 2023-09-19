import java.util.Scanner;

public class OvenAlarm_2525 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int addH;
		if (a >= 0 && a <= 23 && b >= 0 && b <= 59 && c >= 0 && c <= 1000) {
			if (b + c < 60) {
				b += c;
			}
			else {
				addH = (b + c) / 60;
				b = (b + c) % 60;
				if (a + addH >= 24) {
					a = (a + addH) % 24;
				}
				else {
					a += addH;
				}
			}
		}
		System.out.print(a);
		System.out.print(" ");
		System.out.println(b);
		
		scan.close();

	}

}
