public class Calculator {

	public void sum(int a, int b) {
		System.out.println("Result = " + a + b);
	}

	public void difference(int a, int b) {
		System.out.println("Result = " + a - b);
	}

	public void multiplication(int a, int b) {
		System.out.println("Result = " + a * b);
	}
	public void devision(int a, int b) {
		System.out.println("Result = " + (double) a / b);
	}
	public void degree(int a, int b) {
		int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
		System.out.println("Result = " + result);
	}
	public void moduloDivision(int a, int b) {
		System.out.println("Result = " + a % b);
	}

} 