package com.startjava.lesson1.unicode;

public class Unicode {
    public static void main(String[] args) {
    	int i = 33;
      	while (i < 126) {
      		System.out.print((char)i + ", ");
      		i++;
      	}
      	System.out.print((char)126);
    }
} 