package com.example.exceptionhandling;

import com.example.inheritance.Loan;

public class PersonalLoan {



    public static void main(String[] args) throws Exception {
        Loan loan = new Loan();

        try {
            loan.getInterestRate("AB");
        } catch (Exception exception) {
            System.out.println("Exception occurred");
        } finally {
            System.out.println("Completed");
        }
    }
}
