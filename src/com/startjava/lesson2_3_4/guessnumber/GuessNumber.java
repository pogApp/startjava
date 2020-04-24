package com.startjava.lesson2_3_4.guessnumber;

import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        int randomNumber = (int) (Math.random() * 101);
        p1.clear();
        p2.clear();
        System.out.println("Both of you have 10 chances.");
        for (int i = 0; i < 10; i++) {
            System.out.println(p1.getName() + ", enter the number:");
            p1.setNum(scan.nextInt(), i);
            if (p1.getNum(i) == randomNumber) {
                System.out.println(p1.getName() + " guessed the number from the " + (i + 1) + " attempt! It is " + randomNumber + ". Congratulations!");
                p1.copy(i);
                p2.copy(i - 1);
                break;
            } else {
                if (p1.getNum(i) > randomNumber) {
                    System.out.println(p1.getName() + ", your number is too big");
                } else {
                    System.out.println(p1.getName() + ", your number is too small");
                }
            }
            if (i == 9) {
                System.out.println(p1.getName() + " no longer has a chance.");
            }
            System.out.println(p2.getName() + ", enter the number:");
            p2.setNum(scan.nextInt(), i);
            if (p2.getNum(i) == randomNumber) {
                System.out.println(p2.getName() + " guessed the number from the " + (i + 1) + " attempt! It is " + randomNumber + ". Congratulations!");
                p1.copy(i);
                p2.copy(i);
                break;
            } else {
                if (p2.getNum(i) > randomNumber) {
                    System.out.println(p2.getName() + ", your number is too big");
                } else {
                    System.out.println(p2.getName() + ", your number is too small");
                }
            }
            if (i == 9) {
                System.out.println(p2.getName() + " no longer has a chance.");
                p1.copy(i);
                p2.copy(i);
            }
        }

    }
}