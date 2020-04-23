package com.startjava.lesson2.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resume = "yes";
		String[] operation;

		while ("yes".equals(resume)) {
			System.out.print("What do you want to calculate? Enter: ");
			operation = scan.nextLine().split(" ");
			Calculator calc = new Calculator(Integer.parseInt(operation[0]), operation[1], Integer.parseInt(operation[2]));
			calc.calculate();
			resume = "question";
			while (!"yes".equals(resume) && !"no".equals(resume)) {
				System.out.println("Do you want to resume? 'yes' or 'no'");
				resume = scan.next();
			}
		}
	}
}