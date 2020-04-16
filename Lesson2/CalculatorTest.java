import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.print("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.print("Enter the math operator: ");
		calc.setOperator(scan.next());

		System.out.print("Enter the second number: ");
		int b = scan.nextInt();

		calc.calculate(a, b);

	}
}