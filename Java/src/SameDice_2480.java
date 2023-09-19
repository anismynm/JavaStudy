import java.util.Scanner;

public class SameDice_2480 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0;
		int reward = 0;
		
		if (a == b && b == c) {
			reward = 10000 + (a * 1000);
		}
		
		else if (a != b && b != c && c != a) {
			if (a > b && a > c) {
				max = a;
			}
			else if (b > c && b > a) {
				max = b;
			}
			else if (c > a && c > b) {
				max = c;
			}
			reward = max * 100;
		}
		
		else if (a == b && c != a) {
			reward = 1000 + (a * 100);
		}
		
		else if (b == c && a != b) {
			reward = 1000 + (b * 100);
		}
		
		else if (c == a && b!= c) {
			reward = 1000 + (c * 100);
		}
		
		System.out.println(reward);
		
		scan.close();
		
	}

}