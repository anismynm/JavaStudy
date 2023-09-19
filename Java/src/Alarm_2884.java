import java.util.Scanner;

public class Alarm_2884 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		if (H >= 0 && H <= 23 && M >= 0 && M <= 59) {
			if (M >= 45) {
				M -= 45;
				System.out.print(H + " ");
				System.out.println(M);
			}
			else {
				M += 15;
				
				if (H != 0) {
					H -= 1;
					System.out.print(H + " ");
					System.out.println(M);
				}
				else {
					H += 23;
					System.out.print(H + " ");
					System.out.println(M);
				}
			}
		}
		
		scan.close();
	}

}
