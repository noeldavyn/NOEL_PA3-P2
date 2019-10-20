package com.company;
import java.util.Scanner;

    public class SavingsAccount {

        private double savingsBalance;
        private static double annualInterestRate;

    public SavingsAccount() {
        savingsBalance = 0;
        annualInterestRate = 0;
    }

    public SavingsAccount(double balance) {
        savingsBalance = balance;
        annualInterestRate = 0;
    }

    public void calculateMonthlyInterest() {
        System.out.println("Current savings balance: " + savingsBalance);
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance = monthlyInterest;
        System.out.println("New savings balance: " + savingsBalance);
    }

    public double getBalance() {
        return savingsBalance;
    }
    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }
}


