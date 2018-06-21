package com.artilekt.account;

public abstract class Account {
	private int balance = 0;
	protected int collectedFees = 0;
    public static final int MAX_DEPOSIT_AMOUNT = 1000;
    public static final int MAX_WITHDRAWL_AMOUNT = 500;

	public Account(int balance) {
		this.balance = balance;
	}

	public Account() {
		this(0);
	}

	/**
	 * Allows to deposit money into account
	 * @param amount : amount to be deposited
	 */
	public void deposit(int amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Amount can't be negative! ["+amount+"]", amount);
        if (amount > MAX_DEPOSIT_AMOUNT)
            throw new ExcessiveDepositException("Amount can't exceed ["+MAX_DEPOSIT_AMOUNT+
                    "]. Amount passed: ["+amount+"]");
	    this.balance += amount;
	}

	public void withdraw(int amount) {
        if (amount <= 0)
            throw new InvalidAmountException("Amount can't be negative! ["+amount+"]", amount);
        if (amount > getBalance())
            throw new AccountOverdrawnException("Account is overdrawn");
        if (amount > MAX_WITHDRAWL_AMOUNT)
            throw new ExcessiveWithdrawlException("Amount can't exceed ["+MAX_WITHDRAWL_AMOUNT+
                    "]. Amount passed: ["+amount+"]");

        this.balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

	public int getCollectedFees() {
	    return collectedFees;
    }

}
