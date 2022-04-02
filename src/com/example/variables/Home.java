package com.example.variables;

public class Home {

    public static void main(String[] args) {

        Person.type = "";

        Person rajKumarObject = new Person();
        rajKumarObject.name = "Raj Kumar";
        rajKumarObject.yearOfBirth = 1994;

        Education rajKumarEducation = new Education();
        rajKumarEducation.grade = 'A';
        rajKumarObject.education = rajKumarEducation;

        Person saranyaObject = new Person();
        saranyaObject.name = "Saranya";
        saranyaObject.yearOfBirth = 1987;

        Person rajaObject = new Person();
        rajaObject.name = "Raja";
        rajaObject.yearOfBirth = 1987;

        rajKumarObject.printDetails();
        saranyaObject.printDetails();
        rajaObject.printDetails();

    }

}
