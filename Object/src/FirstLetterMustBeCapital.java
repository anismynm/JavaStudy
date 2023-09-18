// 컴퓨터공학전공 2020112736 2학년 안성현 20230907
import java.util.Scanner;

public class FirstLetterMustBeCapital {

	public static void main(String[] args) {
		Scanner oInput = new Scanner(System.in); //스캐너 선언, 생성
		String sName;
		int iNum;
	 
		System.out.print("Input Your Name,Number: ");
		sName = oInput.next();
		iNum = oInput.nextInt();
		
		System.out.println("Your Name is " + sName);
		System.out.println("Your Number is " + iNum);
		oInput.close(); //스캐너는 반드시 close 해줘야함. 
		
	}
}