package com.example.variables;

//class is a blueprint

/**
 * Class which stores person name and calculates age
 */

/*
 Private - can be accessed only within the class
 Public - can be accessed by any class
 Protected - Can be accessed by class within the package and any sub-class
 Default - Can be accessed by class within the package
 */

public class Person {
    /*
    attributes (fields)
    behaviors (methods)
    */

    static String type = "Human"; //common to all objects
    String name;
    int yearOfBirth;
    Education education;

    private int calculateAge() {
        int currentYear = 2022;

        return currentYear - yearOfBirth;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge());

        if(education != null) {
            System.out.println("Education: " + education.grade);
        }
    }
}
