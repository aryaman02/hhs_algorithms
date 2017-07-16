package net.aryaman.algo.misc;

public class Account {
    public static enum AccountType {
        Checking, Savings
    }
    private AccountType accountType;
    private String personName;
    private int money;
    private String ssn;

    public Account(AccountType atype, String person, int amount, String socialSecurityNumber) {
        super();
        this.accountType = atype;
        this.personName = person;
        this.money = amount;
        this.ssn = socialSecurityNumber;
    }

    public void deposit(int moneyTransaction) {
        if (money < 0) {
            System.out.println("Not a valid amount of money");

        } else if (moneyTransaction < 0) {
            System.out.println("Not a valid deposit input");
            return;
        }
        money = money + moneyTransaction;
    }

    public void withdraw(int moneyTransaction) {
        if (moneyTransaction < 0) {
            System.out.println("Not a valid withdrawal input");
            return;
        }

        if (money < 0) {
            System.out.println("Not a valid amount of money");
        }
        else if (moneyTransaction > money) {
            System.out.println("Cannot withdraw more than current balance:");
            return;
        }

        money = money - moneyTransaction;
    }
    public int getCurrentAmount() {
        return money;
    }

    public void transferFrom(Account source, int transferAmount) {
        if (transferAmount > source.getCurrentAmount()) {
            System.out.println("Can't transfer money from source, as it does not have enough money");
            return;
        }
        source.withdraw(transferAmount);
        this.deposit(transferAmount);

    }
    public void display() {
        System.out.println(ssn);
        System.out.println(money);
        System.out.println(personName);
        System.out.println(accountType);
    }
    public static void main(String[] args) {
        BankAccount c = new Checking();
        c.deposit(48.99);
        double currentAmount = c.getBalance();
        System.out.println("Current balance: " + "$" + currentAmount);
        c.withdraw(5.19);
        currentAmount = c.getBalance();
        System.out.println("Current balance: " + "$" + currentAmount);

    }
}