package com.kiranthepro;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many sides does your die have?");
        int sideNum = scanner.nextInt();

        System.out.println("How many times do you want to throw the die?");
        int throwNum = scanner.nextInt();

        int[] counts = new int[sideNum];

        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        int numberThrown = 0;

        for (int throwCount = 0; throwCount < throwNum; throwCount++) {
            numberThrown = random.nextInt((sideNum+1-1)) + 1;
            System.out.println(numberThrown);
            counts[numberThrown-1]++;
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(i+1 + " was thrown " + counts[i] + " times");
        }
    }
}
