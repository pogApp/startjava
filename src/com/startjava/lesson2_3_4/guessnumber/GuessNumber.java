package com.startjava.lesson2_3_4.guessnumber;

import java.util.Scanner;

public class GuessNumber {
    private Player p1;
    private Player p2;
    private Scanner scan = new Scanner(System.in);
    private int randomNumber;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        generateRandomNumber();
        System.out.println("Both of you have 10 chances.");
        p1.clear();
        p2.clear();
        for (int i = 0; i < 10; i++) {
            enterNumber(p1, i);
            if (compareNumbers(p1, i)) {
                break;
            }
            enterNumber(p2, i);
            if (compareNumbers(p2, i)) {
                break;
            }
        }
        displayNumbers(p1);
        displayNumbers(p2);
    }

    private void generateRandomNumber() {
        randomNumber = (int) (Math.random() * 101);
    }

    private void enterNumber(Player player, int i) {
        player.incAttempt();
        System.out.println(player.getName() + ", attempt " + player.getAttempt() + ", enter the number:");
        player.setNumber(scan.nextInt(), i);
    }

    private boolean compareNumbers(Player player, int i) {
        int playerNum = player.getLastNumber(i);
        String playerName = player.getName();
        if (playerNum == randomNumber) {
            System.out.println(playerName + " guessed the number from the " + player.getAttempt() + " attempt! It is " + randomNumber + ". Congratulations!");
            return true;
        } else if (playerNum > randomNumber) {
                System.out.println(playerName + ", your number is too big");
        } else {
            System.out.println(playerName + ", your number is too small");
        }
        if (i == 9) {
            System.out.println(playerName + " no longer has a chance.");
        }
        return false;
    }

    private void displayNumbers(Player player) {
        System.out.print("\n" + player.getName() + "'s numbers: ");
        for (int num : player.getEnteredNumbers(player.getAttempt())) {
            System.out.print(num + " ");
        }
    }
}