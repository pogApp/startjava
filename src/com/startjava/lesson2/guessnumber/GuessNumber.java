package com.startjava.lesson2.guessnumber;

import java.util.Scanner;

public class GuessNumber {
	private int randomNumber;
	private Player p1;
	private Player p2;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player p1, Player p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public void start() {
		randomNumber = (int) (Math.random() * 101);
		while (true) {
			System.out.println(p1.getName() + ", enter the number:");
			p1.setNum(scan.nextInt());
			System.out.println(p2.getName() + ", enter the number:");
			p2.setNum(scan.nextInt());
			if (p1.getNum() == randomNumber) {
				System.out.println(p1.getName() + ", you are right! It is " + randomNumber + ". Congratulations!");
				break;
			} else if (p2.getNum() == randomNumber) {
				System.out.println(p2.getName() + ", you are right! It is " + randomNumber + ". Congratulations!");
				break;
			} else {
				if (p1.getNum() > randomNumber) {
					System.out.println(p1.getName() + ", your number is too big");
				} else {
					System.out.println(p1.getName() + ", your number is too small");
				}
				if (p2.getNum() > randomNumber) {
					System.out.println(p2.getName() + ", your number is too big");
				} else {
					System.out.println(p2.getName() + ", your number is too small");
				}
			}
		}
	}
}