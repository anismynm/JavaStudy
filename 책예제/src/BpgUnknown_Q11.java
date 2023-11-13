import java.util.Scanner;

abstract class Calc {
	protected int a, b;
	
	Calc() {
		a = 0;
		b = 0;
	}
	
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	abstract int calculate();
	
}

class Add extends Calc {

	@Override
	int calculate() {
		return a + b;
	}
	
}

class Sub extends Calc {

	@Override
	int calculate() {
		return a - b;
	}
	
}

class Mul extends Calc {

	@Override
	int calculate() {
		return a * b;
	}
	
}

class Div extends Calc {

	@Override
	int calculate() {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
	
}

public class BpgUnknown_Q11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하시오. >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		char op = scan.next().charAt(0);
		
		Calc calc = null;
		
		if (op == '+') {
			calc = new Add();
		}
		else if (op == '-') {
			calc = new Sub();
		}
		else if (op == '*') {
			calc = new Mul();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		else if (op == '/') {
			calc = new Div();
		}
		
		calc.setValue(a, b);
		System.out.println(calc.calculate());
		
		scan.close();

	}

}
