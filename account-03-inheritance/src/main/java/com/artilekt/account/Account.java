package com.artilekt.account;

public abstract class Account {
	private int balance = 0;
	protected int collectedFees = 0;

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
		this.balance += amount;
	}

	public int withdraw(int amount) {
		if (balance < amount)   return -1;
	    balance -= amount;
	    return 1;
	}

	public int getBalance() {
		return balance;
	}

	public int getCollectedFees() {
	    return collectedFees;
    }

}
