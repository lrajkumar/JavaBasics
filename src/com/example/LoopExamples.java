package com.example;

public class LoopExamples {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        int k = 1;
        do {
            System.out.println(k);
        } while (k <= 0);

    }
}
