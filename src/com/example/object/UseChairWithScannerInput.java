package com.example.object;

import java.util.Scanner;

public class UseChairWithScannerInput {

    public static void main(String[] args) {
        
        Chair firstChair = new Chair();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Brand");
        firstChair.brand = scanner.next();

        System.out.println("Enter price");
        firstChair.price = scanner.nextInt();

        System.out.println("Has hands");
        firstChair.hasHands = scanner.nextBoolean();

        firstChair.printDetails();
    }
}
