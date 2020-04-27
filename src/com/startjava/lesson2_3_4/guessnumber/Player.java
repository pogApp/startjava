package com.startjava.lesson2_3_4.guessnumber;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnteredNumbers(int enteredNumbers, int i) {
        this.enteredNumbers[i] = enteredNumbers;
    }

    public int getEnteredNumbers(int i) {
        return enteredNumbers[i];
    }

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }

    public void clear() {
        Arrays.fill(enteredNumbers, -1);
    }

    public void cut(int i) {
        enteredNumbers = Arrays.copyOf(enteredNumbers, i + 1);
    }
}