package com.startjava.lesson2_3_4.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String resume = "yes";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the first Player: ");
		Player p1 = new Player(scan.nextLine());
		System.out.print("Enter the name of the second Player: ");
		Player p2 = new Player(scan.nextLine());
		System.out.println("Okay! " + p1.getName() + " and " + p2.getName() + ", let's play!");

		GuessNumber game = new GuessNumber(p1, p2);
		while ("yes".equals(resume)) {
			game.start();
			do {
				System.out.println("\nWant to resume? 'yes' or 'no'");
				resume = scan.next();
			} while (!"yes".equals(resume) && !"no".equals(resume));

		}
	}
}