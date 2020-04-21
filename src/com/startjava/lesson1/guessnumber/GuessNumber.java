package com.startjava.lesson1.guessnumber;

public class GuessNumber {
    public static void main(String[] args) {
        int randomNum = 72;
        int playerNum = 50;
        int leftBorder = 1;
        int rightBorder = 100;

        while (playerNum != randomNum) {
            if (playerNum > randomNum) {
                System.out.println("Your number " + playerNum + " is bigger that computer random number");
                rightBorder = playerNum;
                playerNum = (playerNum + leftBorder) / 2;
            } else {
                System.out.println("Your number " + playerNum + " is smaller that computer random number");
                leftBorder = playerNum;
                playerNum = (playerNum + rightBorder) / 2;
            }
        }
        System.out.println("You are right! It is " + playerNum);
    }
}
