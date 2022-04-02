package com.example;

public class LoopExampleInRealLife {

    public static void main(String[] args) {

        int[] marks = {50, 23, 38, 99, 20};

        boolean isFailed = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                isFailed = true;
                System.out.println("checking " + marks[i]);
                break;
            }
        }

        if (isFailed) {
            System.out.println("Student failed");
        }

    }
}
