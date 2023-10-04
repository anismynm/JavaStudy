public class Bpg165_Q8 {

    public static void main(String[] args) {
        int[][] arr = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int i = 0;

        while (i < 8) {
            int p = (int) Math.round(Math.random() * 3);
            int q = (int) Math.round(Math.random() * 3);
            if (arr[p][q] != 0) {
                arr[p][q] = (int) Math.round(Math.random() * 9 + 1);
                i++;
            }
        }

        for (int j = 0; j < 4; j ++) {
            for (int k = 0; k < 4; k ++) {
                System.out.print(arr[j][k]);
                System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}

// 맞게 한것 같은데 컴파일하면 아무것도 안뜸

