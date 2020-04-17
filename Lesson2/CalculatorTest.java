import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resume = "yes";

		while ("yes".equals(resume)) {
			System.out.print("Enter the first number: ");
			int a = scan.nextInt();
			System.out.print("Enter the math operator: ");
			String operator = scan.next();
			System.out.print("Enter the second number: ");
			int b = scan.nextInt();
			Calculator calc = new Calculator(a, operator, b);
			calc.calculate();
			resume = "question";
			while (!"yes".equals(resume) && !"no".equals(resume)) {
				System.out.println("Do you want to resume? 'yes' or 'no'");
				resume = scan.next();
			}
		}
	}
}