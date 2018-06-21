package com.artilekt.account;

public class Account {
	private int balance = 0;

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

	public void withdraw(int amount) {
		balance -= amount;
	}

	public int getBalance() {
		return balance;
	}

}
