package com.startjava.lesson2_3_4.calculator;

public class Calculator {
	private String[] operation;

	public Calculator(String operation) {
		this.operation = operation.split(" ");
	}

	public void calculate() {
		switch (operation[1]) {
			case "+": System.out.println("Result = " + (Integer.parseInt(operation[0]) + Integer.parseInt(operation[2])));
				break;
			case "-": System.out.println("Result = " + (Integer.parseInt(operation[0]) - Integer.parseInt(operation[2])));
				break;
			case "*": System.out.println("Result = " + Integer.parseInt(operation[0]) * Integer.parseInt(operation[2]));
				break;
			case "/": System.out.println("Result = " + (double) Integer.parseInt(operation[0]) / Integer.parseInt(operation[2]));
				break;
			case "^":
				System.out.println("Result = " + Math.pow(Integer.parseInt(operation[0]), Integer.parseInt(operation[2])));
				break;
			case "%": System.out.println("Result = " + Integer.parseInt(operation[0]) % Integer.parseInt(operation[2]));
				break;
			default: System.out.println("Math operator is wrong!");
		}
	}
}