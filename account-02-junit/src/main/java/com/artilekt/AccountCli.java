package com.artilekt;

import com.artilekt.account.Account;


public class AccountCli {

	public static void main(String[] args) {
	    Account a1 = new Account();
	    Account a2 = new Account(200);
	    int depositAmount = 30;
	    int withdrawAmount = 70;

        // simple comment - and simple printout to console
        System.out.println("a1 balance is "+a1.getBalance());
        System.out.println("a2 balance is "+a2.getBalance());

        a1.deposit(depositAmount);

        System.out.println("deposited "+depositAmount+" to account a1");
        // we can also call out to another method to make main method more concise
        printBalances(a1, a2);

        a2.withdraw(withdrawAmount);

        System.out.println("withdrew "+withdrawAmount+" from account a2");
        printBalances(a1, a2);
    }


	private static void printBalances(Account a1, Account a2) {
        System.out.println("a1 balance is "+a1.getBalance());
        System.out.println("a2 balance is "+a2.getBalance());

    }

}
