package com.startjava.lesson2_3_4.guessnumber;

import java.util.Arrays;

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
        for (int i = 0; i < 10; i++) {
            enterNumber(p1, i);
            if (check(p1, i, randomNumber)){
                writeNumbers(p1, i + 1);
                writeNumbers(p2, i);
                break;
            }
            enterNumber(p2, i);
            if (check(p2, i, randomNumber)){
                writeNumbers(p1, i + 1);
                writeNumbers(p2, i + 1);
                break;
            }
            if (i == 9) {
                writeNumbers(p1, i + 1);
                writeNumbers(p2, i + 1);
            }
        }
    }

    public void enterNumber(Player player, int i){
            System.out.println(player.getName() + ", attempt " + (i + 1) + ", enter the number:");
            player.setNumber(scan.nextInt(), i);
    }

    private boolean check(Player player, int i, int randomNumber) {
        if (player.getEnteredNumber(i) == randomNumber) {
            System.out.println(player.getName() + " guessed the number from the " + (i + 1) + " attempt! It is " + randomNumber + ". Congratulations!");
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

    public void writeNumbers(Player player,int i) {
        System.out.print("\n" + player.getName() + "'s numbers: ");
        for (int j:Arrays.copyOf(player.getEnteredNumbers(),i)) {
            System.out.print(j + " ");
        }
        Arrays.fill(player.getEnteredNumbers(), 0 , i, -1);
    }


}