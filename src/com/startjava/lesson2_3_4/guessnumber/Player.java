package com.startjava.lesson2_3_4.guessnumber;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] num = new int[10];
    private int[] numActual;

    public Player(String name) {
        this.name = name;
    }

	public void clear() {
		Arrays.fill(num, -1);
	}

	public int[] getNumActual() {
    	return numActual;
	}

    public void copy(int i) {
		numActual = Arrays.copyOf(num, i + 1);
    }

    public String getName() {
        return name;
    }

    public void setNum(int num, int i) {
        this.num[i] = num;
    }

    public int getNum(int i) {
        return num[i];
    }
}