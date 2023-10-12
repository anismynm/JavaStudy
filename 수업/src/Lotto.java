
public class Lotto {
	
	public static void MakingList(int List[][]) {
		for (int i = 0; i < 5; i ++) {
			int j = 0;
			while (j < 6) {
				double dValue = Math.random();
				int iValue = (int)(dValue * 45) + 1;
				int k = 0;
				while (k <= j) {
					if (List[i][k] == iValue) {
						break;
					}
					k++;
				}
				if (k == j+1) {
					List[i][j] = iValue;
					j++;
				}
			}
		}
	}
	
	public static void SortingList(int List[][]) {
		for (int i = 0; i < 5; i ++) {
			for (int j = 1; j < 6; j ++) {
				for (int k = 0; k < j; k ++) {
					if (List[i][k] > List[i][j]) {
						int cnt = List[i][k];
						List[i][k] = List[i][j];
						List[i][j] = cnt;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int iLottoList[][] = {{0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
		MakingList(iLottoList);
		SortingList(iLottoList);
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j < 6; j ++) {
				System.out.print(iLottoList[i][j] + " ");
			}
			System.out.println();
		}
	}

}