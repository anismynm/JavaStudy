import java.util.Scanner;

class Triangle {
	int length;
	int height;
	Triangle () {
	}
}
public class Week6_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Triangle A = new Triangle();
		Triangle B = new Triangle();
		
		System.out.print("삼각형1 밑변 >> ");
		A.length = scan.nextInt();
		System.out.print("삼각형1 높이 >> ");
		A.height = scan.nextInt();
		System.out.print("삼각형2 밑변 >> ");
		B.length = scan.nextInt();
		System.out.print("삼각형2 높이 >> ");
		B.height = scan.nextInt();
		
		if ((0.5 * A.length * A.height) > (0.5 * B.length * B.height)) {
			System.out.println("삼각형 1이 더 넓습니다!");
		}
		else if ((0.5 * A.length * A.height) < (0.5 * B.length * B.height)) {
			System.out.println("삼각형 2가 더 넓습니다!");
		}
		else {
			System.out.println("두 삼각형의 넓이가 같습니다!");
		}
		
		scan.close();
	}

}
