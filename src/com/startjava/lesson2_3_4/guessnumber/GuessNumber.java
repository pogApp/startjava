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
        System.out.println("Both of you have 10 chances.");
        p1.clearNumbersAndAttempts();
        p2.clearNumbersAndAttempts();
        for (int i = 0; i < 10; i++) {
            enterNumber(p1, i);
            if (compareNumbers(p1, i, randomNumber)){
                displayNumbers(p1);
                displayNumbers(p2);
                break;
            }
            enterNumber(p2, i);
            if (compareNumbers(p2, i, randomNumber)){
                displayNumbers(p1);
                displayNumbers(p2);
                break;
            }
            if (i == 9) {
                displayNumbers(p1);
                displayNumbers(p2);
            }
        }
    }

    private void enterNumber(Player player, int i){
        player.setAttempt(player.getAttempt() + 1);
        System.out.println(player.getName() + ", attempt " + player.getAttempt() + ", enter the number:");
        player.setNumber(scan.nextInt(), i);
    }

    private boolean compareNumbers(Player player, int i, int randomNumber) {
        if (player.getEnteredNumber(i) == randomNumber) {
            System.out.println(player.getName() + " guessed the number from the " + player.getAttempt() + " attempt! It is " + randomNumber + ". Congratulations!");
            return true;
        } else {
            if (player.getEnteredNumber(i) > randomNumber) {
                System.out.println(player.getName() + ", your number is too big");
            } else {
                System.out.println(player.getName() + ", your number is too small");
            }
            if (i == 9) {
                System.out.println(player.getName() + " no longer has a chance.");
            }
            return false;
        }
    }

    private void displayNumbers(Player player) {
        System.out.print("\n" + player.getName() + "'s numbers: ");
        for (int j:player.getEnteredNumbers(player.getAttempt())) {
            System.out.print(j + " ");
        }
    }
}