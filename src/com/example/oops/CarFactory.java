package com.example.oops;

public class CarFactory {


    public static void main(String[] args) {

        Car bmw = new Car();

        String carInfo = args[0];

        String[] values = carInfo.split(",");

        bmw.color = values[0];

        bmw.name = "BMW 320d";
        bmw.noOfTyres = Integer.parseInt(values[1]);
        bmw.hasSpeedControl = Boolean.parseBoolean(values[2]);

        System.out.println(bmw.color);
        System.out.println(bmw.maxNoOfGears());
        System.out.println(bmw.maxSpeed());
    }

}
