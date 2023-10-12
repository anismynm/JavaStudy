
public class GuGudanExpert {

	public static void main(String[] args) {
		for (int k = 1 ; k <= 7; k += 3) {
			for (int i = 1; i <= 9; i ++) {
				for (int j = k; j <= k + 2; j ++) {
					System.out.print(j + "*" + i + "=" + j * i + " ");
				}
				System.out.println();
			}
			System.out.println("======================");
		}
	}
}
