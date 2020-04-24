package com.startjava.lesson2_3_4.calculator;

public class Calculator {
	private String[] splitMathExpression;

	public Calculator(String mathExpression) {
		this.splitMathExpression = mathExpression.split(" ");
	}

	public void calculate() {
		switch (splitMathExpression[1]) {
			case "+": System.out.println("Result = " + (Integer.parseInt(splitMathExpression[0]) + Integer.parseInt(splitMathExpression[2])));
				break;
			case "-": System.out.println("Result = " + (Integer.parseInt(splitMathExpression[0]) - Integer.parseInt(splitMathExpression[2])));
				break;
			case "*": System.out.println("Result = " + Integer.parseInt(splitMathExpression[0]) * Integer.parseInt(splitMathExpression[2]));
				break;
			case "/": System.out.println("Result = " + (double) Integer.parseInt(splitMathExpression[0]) / Integer.parseInt(splitMathExpression[2]));
				break;
			case "^":
				System.out.println("Result = " + Math.pow(Integer.parseInt(splitMathExpression[0]), Integer.parseInt(splitMathExpression[2])));
				break;
			case "%": System.out.println("Result = " + Integer.parseInt(splitMathExpression[0]) % Integer.parseInt(splitMathExpression[2]));
				break;
			default: System.out.println("Math operator is wrong!");
		}
	}
}