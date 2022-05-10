package com.example.inheritance;

public class VehicleLoan extends Loan {

    public void getInterestRate() {
        System.out.println("5.2%");
    }

    public static void main(String[] args) {
        VehicleLoan loan = new VehicleLoan();
        loan.getInterestRate();
    }
}
