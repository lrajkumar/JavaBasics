package com.example.inheritance;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class CarLoan extends Loan {

    public void getInterestRate(String username) {
        if(username.startsWith("Ra")) {
            System.out.println("0%");
        } else {
            System.out.println("2.2%");
        }
    }

    public static void main(String[] args) {
        CarLoan loan = new CarLoan();

        List<String> values = new ArrayList<>();
        values.add("1");
        values.add("21");
        values.add("31");
        values.add("11");
        values.add("2");

        values.stream()
                .filter(value -> value.endsWith("1")) // input-> process -> output (boolean)
                .mapToInt(Integer::parseInt) // input-> process -> output
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // input-> process -> no return (output)
    }
}
