
public class Add1to10 {

	public static void main(String[] args) {
		int result, iCnt;
		result = 0;
		for (int i = 0; i < 10; i ++) {
			iCnt = i + 1;
			result += iCnt;
		}
		System.out.println(result);
	}

}
