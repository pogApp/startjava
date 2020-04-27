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
    private boolean doAttempt(Player player, int i, int randomNumber) {
        System.out.println(player.getName() + ", attempt " + (i + 1) + ", enter the number:");
        player.setEnteredNumbers(scan.nextInt(), i);
        if (player.getEnteredNumbers(i) == randomNumber) {
            System.out.println(player.getName() + " guessed the number from the " + (i + 1) + " attempt! It is " + randomNumber + ". Congratulations!");
            if (player == p1) {
                p1.cut(i);
                p2.cut(i - 1);
            } else {
                p1.cut(i);
                p2.cut(i);
            }
            return false;
        } else {
            if (player.getEnteredNumbers(i) > randomNumber) {
                System.out.println(player.getName() + ", your number is too big");
            } else {
                System.out.println(player.getName() + ", your number is too small");
            }
            if (i == 9) {
                System.out.println(player.getName() + " no longer has a chance.");
            }
            return true;
        }
    }

    public void start() {
        int randomNumber = (int) (Math.random() * 101);
        // int randomNumber = 50;
        p1.clear();
        p2.clear();
        System.out.println("Both of you have 10 chances.");
        for (int i = 0; i < 10; i++) {
            if (!doAttempt(p1, i, randomNumber)){
                break;
            }
            if (!doAttempt(p2, i, randomNumber)){
                break;
            }
        }
    }

    public void outNumbers(Player player) {
        System.out.print("\n" + player.getName() + "'s numbers:");
        for (int j : player.getEnteredNumbers()) {
            System.out.print(" " + j);
        }
    }
}