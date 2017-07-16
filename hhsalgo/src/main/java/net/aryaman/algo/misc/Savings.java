/*
 * ******************************************************
 * Copyright VMware, Inc. 2014.   All Rights Reserved.
 * ******************************************************
 */
package net.aryaman.algo.misc;

public class Savings implements BankAccount {
    private static final int WITHDRAWAL_COST = 10;
    private static final double INTEREST_RATE = 0.04;

    private double currentAmount = 0;

    @Override
    public void deposit(double money) {
        if (money < 0) {
            System.out.println("Not a valid amount to deposit");
            return;
        }
        currentAmount += money;
    }

    @Override
    public void withdraw(double money) {
        if (currentAmount < 100) {
            System.out.println("Can't withdraw because below min balance");
            return;
        }

        if (money < 0) {
            System.out.println("Not a valid transaction");
            return;
        } else if (money+WITHDRAWAL_COST > currentAmount) {
            System.out.println("Can't withdraw more money than balance");
            return;
        }
        currentAmount = currentAmount - money - WITHDRAWAL_COST;
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
        return 100.0;
    }

    @Override
    public double getBalance() {
        return currentAmount;
    }

    /* (non-Javadoc)
     * @see net.om.BankAccount#getAccountType()
     */
    @Override
    public AccountType getAccountType() {
        return AccountType.Savings;
    }

}