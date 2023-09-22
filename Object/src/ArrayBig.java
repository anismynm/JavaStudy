import java.util.Scanner;

public class ArrayBig {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int iArray[] = new int[5]; // 배열 생성
		int i = 0;
		int iMax = iArray[0];
		int iMaxIndex = 0;
		int iSec = iArray[0];
		int iSecIndex = 0;
		
		while (i < 5) {
			System.out.print("양수를 입력하세요. ");
			int oInput = scan.nextInt();
			if (oInput > 0) {
				iArray[i] = oInput;
				i++;
			}
			else {
				System.out.println("양수가 아닙니다.");
			}
		}
		
		for (int j = 1; j < iArray.length; j ++) {
			if (iMax < iArray[j]) {
				iMax = iArray[j];
				iMaxIndex = j;
			}
		}
		
		for (int k = 1; k < iArray.length; k ++) {
			if (iArray[k] < iMax && iArray[k] > iSec) {
				iSec = iArray[k];
				iSecIndex = k;
			}
		}
		
		System.out.println("최댓값: " + iMax + " index: " + iMaxIndex);
		System.out.println("두번째로 큰 값: " + iSec + " index: " + iSecIndex);
		
		scan.close();
	}

}
