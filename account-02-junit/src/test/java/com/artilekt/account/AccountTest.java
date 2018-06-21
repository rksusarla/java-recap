package com.artilekt.account;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/*
 * This is how the tests are being executed - note that the order of execution is 'random',
 * unless @FixMethodOrder
 * *********
 *
 * AccountTest.beforeClass();
 *
 * AccountTest t = new AccountTest();
 * t.setup();
 * t.depositPositiveAmountToZeroAccount();
 * t.tearDown();
 *
 * AccountTest t = new AccountTest();
 * t.setup();
 * t.depositPositiveAmountToNonZeroAccount();
 * t.tearDown();
 *
 * ...
 *
 * AccountTest.afterClass();
 *
 */
// @FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AccountTest {
	private Account positiveAccount;
	private Account zeroAccount;

	@BeforeClass
	public static void beforeClass() {}
	
	@AfterClass
	public static void afterClass() {}
	
	@Before
	public void setup() {
		positiveAccount = new Account(100);
		zeroAccount = new Account(0);
	}
	
	@After
	public void tearDown() {}
	
	
	@Test
	public void depositPositiveAmountToZeroAccount() {
        zeroAccount.deposit(100);
		int balanceAfterDeposit = zeroAccount.getBalance();

		// compare actual balance vs expected balance
		assertEquals("balance is incorrect", 100, balanceAfterDeposit);

		// this is just for a demo - this assertion is testing for essentially the same thing
		assertTrue("getBalace and amount from deposit() must match", zeroAccount.getBalance() > 0);
	}
	
	
	@Test
	public void depositPositiveAmountToNonZeroAccount() {
		positiveAccount.deposit(50);
		assertEquals("balance is incorrect", 150, positiveAccount.getBalance());
	}


	@Test
	public void withdrawPositiveAmountFromNonZeroAccount() {
		positiveAccount.withdraw(20);
		assertEquals("balance is incorrect", 80, positiveAccount.getBalance());
	}

}
