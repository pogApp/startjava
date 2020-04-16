public class Calculator {
	private String operator;
	void setOperator(String operator) {
		this.operator = operator;
	}

	public void calculate(int a,int b) {
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