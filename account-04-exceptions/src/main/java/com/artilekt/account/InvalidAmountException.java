package com.artilekt.account;

public class InvalidAmountException extends IllegalArgumentException {

	private int depositAmount;
	
	public InvalidAmountException(String message) {
		super(message);
	}
	
	public InvalidAmountException(String message, int depositAmount) {
		super(message);
		this.depositAmount = depositAmount;
	}
	
	

}
