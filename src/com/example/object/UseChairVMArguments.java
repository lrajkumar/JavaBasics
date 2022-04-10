package com.example.object;

public class UseChairVMArguments {

    public static void main(String[] args) {
        
        Chair firstChair = new Chair();

        firstChair.brand = args[0];
        firstChair.price = Integer.parseInt(args[1]);
        firstChair.hasHands = Boolean.parseBoolean(args[2]);

        firstChair.printDetails();

    }
}

