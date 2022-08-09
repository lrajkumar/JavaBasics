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

     void multiple() {
           int a=35;
            int b=30;

       System.out.println(a*b);
       System.out.println(a);
       System.out.println("multiplied");
}
 void division() {
     int a=10;
        int b=5;
System.out.println(a/b);
System.out.println(a/b);
}






    public static void main(String[] args) {
        VariableTest obj = new VariableTest();
        obj.add();
        obj.multiple();
obj.division();
        obj.c = 50;


        VariableTest.d = 50;
      System.out.println("Numerical Number to be Added");

    }

}
