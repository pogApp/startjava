import java.util.Scanner;

public class CalculatorTest {
	
	public static void main(String[] args) {

		System.out.print("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		System.out.print("Enter the math operator: ");
		String operator = scan.next();

		System.out.print("Enter the second number: ");
		int b = scan.nextInt();

		Calculator r = new Calculator();

		switch (operator) {
			case "+": r.sum(a, b);
					  break;
			case "-": r.difference(a, b);
					  break;
			case "*": r.multiplication(a, b);
					  break;
			case "/": r.devision(a, b);
					  break;
			case "^": r.degree(a, b);
					  break;
			case "%": r.moduloDivision(a, b);
					  break;
			default: System.out.println("Math operator is wrong!")
		}

	}
}