package com.artilekt.account;

public class SavingsAccount extends Account {
    public SavingsAccount(int balance) {
        super(balance);
    }

    public SavingsAccount() {
    }

    @Override
    public int withdraw(int amount) {
        int fees = (int)Math.round(amount * 0.02);
        fees = fees > 1 ? fees : 1;
        if (amount + fees < getBalance()) {
            collectedFees += fees;
            return super.withdraw(amount + fees);
        }
        return -1;
    }
}
