import java.util.Scanner;

public class Star_2444 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int i, j, k;
		for (i = 1; i < N; i ++) { 
			for (j = 0; j < N - i; j ++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * i - 1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (i = 0; i < 2 * N - 1; i ++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (i = 1; i < N; i ++) {
			for (j = 0; j < i; j ++) {
				System.out.print(" ");
			}
			for (k = 0; k < 2 * (N - i) - 1; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();

	}

}

/* N = 5
 4 1
 3 3
 2 5
 1 7
 0 9
 1 7
 2 5
 3 3
 4 1
 */
