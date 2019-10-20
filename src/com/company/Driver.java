package com.company;
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(4000);
        saver1.modifyInterestRate(.04);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.04);
        saver2.calculateMonthlyInterest();
        saver1.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.modifyInterestRate(.05);
        saver2.calculateMonthlyInterest();
    }
}

