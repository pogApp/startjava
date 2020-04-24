package com.startjava.lesson2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resume = "yes";
        String operation;

        while ("yes".equals(resume)) {
            System.out.print("What do you want to calculate? Enter: ");
            operation = scan.nextLine();
            Calculator calc = new Calculator(operation);
            calc.calculate();
            do {
                System.out.println("Do you want to resume? 'yes' or 'no'");
                resume = scan.nextLine();
            } while (!"yes".equals(resume) && !"no".equals(resume));
        }
    }
}