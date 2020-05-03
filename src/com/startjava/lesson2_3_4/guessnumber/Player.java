package com.startjava.lesson2_3_4.guessnumber;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];
    private int attempt = 10;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int enteredNumber, int i) {
        this.enteredNumbers[i] = enteredNumber;
    }

    public int getEnteredNumber(int i) {
        return enteredNumbers[i];
    }

    public int[] getEnteredNumbers(int i) {
        return Arrays.copyOf(enteredNumbers, i);
    }

    public void doAttempt() {
        attempt++;
    }

    public int getAttempt() {
        return attempt;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, 0 , attempt, -1);
        attempt = 0;
    }
}