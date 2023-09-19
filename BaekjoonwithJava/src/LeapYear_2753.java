import java.util.Scanner;

public class LeapYear_2753 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iYear = scan.nextInt();
		if (iYear >= 1 && iYear <= 4000) {
			if (iYear % 4 == 0) {
				if (iYear % 100 != 0 || iYear % 400 == 0) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else {
				System.out.println(0);
			}
		}
		
		scan.close();

	}

}
