import java.util.Scanner;

abstract class Calc {
	protected int a, b;
	
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class Add extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate() {
		return a + b;
	}
	
}

class Sub extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate() {
		return a - b;
	}
	
}

class Mul extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate() {
		return a * b;
	}
	
}

class Div extends Calc {

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
		
	}

	@Override
	int calculate() {
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
		
		if (op == '+') {
			Add calc = new Add();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		else if (op == '-') {
			Sub calc = new Sub();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		else if (op == '*') {
			Mul calc = new Mul();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		else if (op == '/') {
			Div calc = new Div();
			calc.setValue(a, b);
			System.out.println(calc.calculate());
		}
		else {
			System.out.println("잘못 된 연산자 입력!");
		}
		
		scan.close();

	}

}
