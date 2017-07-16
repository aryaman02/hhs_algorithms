package net.aryaman.algo.misc;

public interface BankAccount {

    static enum AccountType {
        Checking, Savings
    }

    public AccountType getAccountType();

    public void deposit(double money);

    public void withdraw(double money);

    public void addInterest(int time);

    public double minimumBalance();

    public double getBalance();

}