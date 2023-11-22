import java.util.Scanner;

public class BpgUnknown_1127_Q8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sInput = scan.nextLine();
		
		for (int i = 0; i < sInput.length() + 1; i ++) {
			String front = sInput.substring(0, i);
			String back = sInput.substring(i, sInput.length());
			System.out.println(back + front);
		}
		
		scan.close();
	}

}
