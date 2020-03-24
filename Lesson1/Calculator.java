public class Calculator {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        String operator = "%";

        if (operator == "+") {
            System.out.println("Result = " + (a + b));
        } else if (operator == "-") {
            System.out.println("Result = " + (a - b));
        } else if (operator == "*") {
            System.out.println("Result = " + (a * b));
        } else if (operator == "/") {
            System.out.println("Result = " + (double) a / b);
        } else if (operator == "^") {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println("Result = " + result);
        } else if (operator == "%") {
            System.out.println("Result = " + a % b);
        } else {
            System.out.println("I cann't calculate with this operator");
        }
    }
} 