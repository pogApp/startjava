package com.startjava.lesson2_3_4.guessnumber;

public class Player {

    private String name;
    private int[] enteredNumbers = new int[10];

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

    public int[] getEnteredNumbers() {
        return enteredNumbers;
    }
}