package com.example;

public class ReverseNumber {

    public static void main(String[] args) {

        //125362
        //12536
        //1253
        //125
        //12
        //2
        //0
        reverseNumber();
    }

    private static void reverseNumber() {

        String name = "RajKumar";
        int a = 10;

        if(name == "RajKumar") {

        }

        int number = 63; //scanner user input
        int reversedNumber = 0;

        while(number != 0) {
            int remainder = number % 10; // 3, 6 % 10 = 6

            reversedNumber = reversedNumber * 10 + remainder; // 3

            number = number / 10; //removing last digit.. 63 becomes 6
        }

        System.out.println(reversedNumber);
    }
}
