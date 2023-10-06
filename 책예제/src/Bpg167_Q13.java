public class Bpg167_Q13 {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i ++) {
            int iCnt = 0;
            if ((i%10 == 3) || (i%10 == 6) || (i%10 == 9)) { // 끝자리 3, 6, 9에 대해서 count++
                iCnt++;
            }
            if ((i/10 == 3) || (i/10 == 6) || (i/10 == 9)) { // 30, 60, 90번대에 대해서 count++
                iCnt++;
            }
            
            if (iCnt == 1) {
                System.out.println(i + " 박수 짝");
            }
            else if (iCnt == 2) {
                System.out.println(i + " 박수 짝짝");
            }
        }
    }

}
