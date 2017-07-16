package net.aryaman.algo.misc;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.aryaman.algo.misc.Account.AccountType;

public class Bank {
    private final Map<String, Account> accounts = new HashMap<>();

    public void addAccount(String ssn, AccountType accountType, String person, int money) {
        Account account = new Account(accountType, person, money, ssn);
        accounts.put(ssn, account);
    }

    public void removeAccount(String ssn) {
        accounts.remove(ssn);
    }

    public Account getAccount(String ssn) {
        Account account = accounts.get(ssn);
        return account;
    }


    public void listAccounts() {
        Collection<Account> allvalues = accounts.values();

        for (Account a : allvalues) {
            a.display();
        }
    }
}

