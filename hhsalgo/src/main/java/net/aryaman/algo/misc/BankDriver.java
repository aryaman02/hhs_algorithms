package net.aryaman.algo.misc;
import net.aryaman.algo.misc.Account.AccountType;

public class BankDriver {

    public static void main(String[] args) {
        Account a = new Account(AccountType.Checking,  "BankofAmerica", 640, "3452");
        //a.deposit(-5);
        a.withdraw(780);

        int money = a.getCurrentAmount();
        System.out.println("Amount of money: " + money);

        BankDriver driver = new BankDriver();
        driver.transfer();


        Bank bk = new Bank();
        bk.addAccount("3428", AccountType.Checking, "Aryaman", 235);
        bk.addAccount("9812", AccountType.Checking, "Tejeswar", 870);
        bk.listAccounts();
    }
    public void transfer() {
        Account a = new Account(AccountType.Checking,  "BankofAmerica", 640, "6853");
        Account b = new Account(AccountType.Checking,  "BankofAmerica", 280, "9643");

        System.out.println("Balance in A: " + a.getCurrentAmount());
        System.out.println("Balance in B: " + b.getCurrentAmount());

        b.transferFrom(a, 50);
        System.out.println("After transfer");
        System.out.println("Balance in A: " + a.getCurrentAmount());
        System.out.println("Balance in B: " + b.getCurrentAmount());


    }
}



