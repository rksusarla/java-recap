package com.artilekt.account;

public class OverdraftAccount extends Account {
    public final static int MAX_OVERDRAFT_LIMIT = 1000;

    public OverdraftAccount(int balance) {
        super(balance);
    }

    public OverdraftAccount() {
    }

    @Override
    public void withdraw(int amount) {
        if (amount > getBalance() + MAX_OVERDRAFT_LIMIT)
            throw new AccountOverdrawnException("Account is overdrawn");
        super.withdraw(amount);
    }
}
