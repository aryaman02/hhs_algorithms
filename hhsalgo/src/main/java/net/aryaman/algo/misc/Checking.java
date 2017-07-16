/*
 * ******************************************************
 * Copyright VMware, Inc. 2014.   All Rights Reserved.
 * ******************************************************
 */
package net.aryaman.algo.misc;

public class Checking implements BankAccount {
    private static final double INTEREST_RATE = 0.02;

    private double currentAmount = 0;

    @Override
    public void deposit(double money) {
        if (money < 0.0) {
            System.out.println("Not a valid amount to deposit");
            return;
        }
        currentAmount += money;

    }

    @Override
    public void withdraw(double money) {
        if (currentAmount < 50.0) {
            System.out.println("Can't withdraw because below min balance");
            return;
        }

        if (money < 0.0) {
            System.out.println("Not a valid amount to withdraw");
            return;
        }
        else if (money > currentAmount) {
            System.out.println("Can't withdraw more money than balance");
            return;
        }
        currentAmount -= money;

    }

    @Override
    public void addInterest(int time) {
        if (time <= 0) {
            System.out.println("Error, please try again");
            return;
        }
        double interest = currentAmount * INTEREST_RATE * time;
        currentAmount += interest;
    }

    @Override
    public double minimumBalance() {
        return 50.0;
    }

    @Override
    public double getBalance() {
        return currentAmount;
    }

    @Override
    public AccountType getAccountType() {
        return AccountType.Checking;
    }
}