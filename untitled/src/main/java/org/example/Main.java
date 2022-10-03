package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(tokenGenerator(5));
        System.out.println(tokenGenerator(10));
        System.out.println(tokenGenerator(15));
    }

    private static char[] tokenGenerator (int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String chars = "!@#$%^&*()";
        String combination = upper + lower + number + chars;

        char[] token = new char[length];
        Random random = new Random();

        for(int i = 0; i < length; i++) {
            token[i] = combination.charAt(random.nextInt(combination.length()));
        }

        System.out.println("Generated Token is: ");
        return token;
    }
}