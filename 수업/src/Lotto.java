
public class Lotto {
	
	/* public static void MakingList(int List[][]) {
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
	} */ // 이거 왤캐 복잡함? 밑에 새로 짰음.
	
	public static void Making(int List[][]) {
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j < 6; j ++) {
				double dValue = Math.random(); // 0.0 <= dValue < 1.0
				int iValue = (int)(dValue * 45) + 1;
				List[i][j] = iValue;
				
				for (int k = 0; k < j; k ++) {
					if (List[i][j] == List[i][k]) {
						--j;
						break;
					}
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
		int iLottoList[][] = new int[5][6];
		Making(iLottoList);
		SortingList(iLottoList);
		for (int i = 0; i < 5; i ++) {
			for (int j = 0; j < 6; j ++) {
				System.out.print(iLottoList[i][j] + " ");
			}
			System.out.println();
		}
	}

}