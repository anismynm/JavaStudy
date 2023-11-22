import java.util.Scanner;
import java.util.Vector;

public class BpgUnknown_1127_Q1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		int iInput = 0;
		
		System.out.print("정수(-1이 입력될 때 까지) >> ");
		while (iInput != -1) {
			iInput = scan.nextInt();
			v.add(iInput);
		}
		
		int max = 0;
		for (int i = 0; i < v.size() - 1; i ++) { // i 0에서 시작, -1 전 벡터까지
			if (v.get(i) > max) {
				max = v.get(i);
			}
		}
		
		System.out.println("가장 큰 수는 " + max);
		
		scan.close();
	}

}
