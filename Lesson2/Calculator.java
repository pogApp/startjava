public class Calculator {
	private String operator;
	private int a;
	private int b;

	public Calculator(int n1, String operate, int n2) {
		a = n1;
		operator = operate;
		b = n2;
	}

	public void calculate() {
		switch (operator) {
			case "+": System.out.println("Result = " + (a + b));
				break;
			case "-": System.out.println("Result = " + (a - b));
				break;
			case "*": System.out.println("Result = " + a * b);
				break;
			case "/": System.out.println("Result = " + (double) a / b);
				break;
			case "^": int result = 1;
	        	for (int i = 1; i <= b; i++) {
	            	result *= a;
	        	}
				System.out.println("Result = " + result);
				break;
			case "%": System.out.println("Result = " + a % b);
				break;
			default: System.out.println("Math operator is wrong!");
		}
	}
} 