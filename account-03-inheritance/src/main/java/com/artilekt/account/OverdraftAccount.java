package com.artilekt.account;

public class OverdraftAccount extends Account {
    public final static int MAX_OVERDRAFT_LIMIT = 1000;

    public OverdraftAccount(int balance) {
        super(balance);
    }

    public OverdraftAccount() {
    }

    @Override
    public int withdraw(int amount) {
        if (amount > getBalance() + MAX_OVERDRAFT_LIMIT)   return -1;
        super.withdraw(amount);
        return 1;
    }
}
