package com.example;

public class VariableTest {

    int c = 30; //instance variable
    static int d = 40; //static variable - can be accessed without object

    void add() {
        //local variable
        int a = 10;
        int b = 20;

        System.out.println(a +b + c);
    }

    void sub() {
        int a = 10;
        int b = 20;

        System.out.println(a  - b - c);
    }


    public static void main(String[] args) {
        VariableTest obj = new VariableTest();
        obj.add();
        obj.c = 50;

        VariableTest.d = 50;

    }

}
