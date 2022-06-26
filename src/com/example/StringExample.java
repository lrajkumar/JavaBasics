package com.example;

public class StringExample {

    public static void main(String[] args) {

        String name = "Raj Kumar";
        int age = 27;

        String note = "Once upon a time, there lived a king. His name was '" + name + "' and he aged " + age + " years";

        StringBuilder builder = new StringBuilder();
        builder.append("Once upon a time, there lived a king. His name was ");
        builder.append("'");
        builder.append(name);
        builder.append("'");
        builder.append(" and he aged ");
        builder.append(age);
        builder.append(" years");


        StringBuffer buffer = new StringBuffer();
        buffer.append("Once upon a time, there lived a king. His name was ");
        buffer.append("'");
        buffer.append(name);
        buffer.append("'");
        buffer.append(" and he aged ");
        buffer.append(age);
        buffer.append(" years");


        System.out.println(note);
        System.out.println(builder.toString());
        System.out.println(buffer.toString());
        System.out.println("Need to commit in github");
    }


}
