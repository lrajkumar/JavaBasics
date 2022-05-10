package com.example.inheritance;

public class Loan {

    public void getInterestRate() {
        System.out.println("1.2%");
    }

    public void getInterestRate(String username) throws Exception {

        if(username.length() == 1) {
            throw new Exception("Username length cannot be one character");
        }

        if(username.equals("RajKumar")) {
            System.out.println("0%");
        } else {
            System.out.println("1.2%");
        }
    }
}
