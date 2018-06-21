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
	private Account savingsAccount;
	private Account overdraftAccount;
	private Account checkingAccount;

	@BeforeClass
	public static void beforeClass() {}
	
	@AfterClass
	public static void afterClass() {}
	
	@Before
	public void setup() {
		positiveAccount = new CheckingAccount(100);
		zeroAccount = new CheckingAccount(0);
		savingsAccount = new SavingsAccount(1000);
		overdraftAccount = new OverdraftAccount(100);
		checkingAccount = new CheckingAccount(100);
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


	@Test
    public void overdrawCheckingAccount() {
        assertTrue(checkingAccount.withdraw(checkingAccount.getBalance()+10) < 0);
    }


    @Test
    public void overdrawSavingsAccount() {
        assertTrue(savingsAccount.withdraw(savingsAccount.getBalance()+10) < 0);
    }


    @Test
    public void overdrawOverdraftAccountBelowLimit() {
        assertTrue(overdraftAccount.withdraw(overdraftAccount.getBalance()+100) > 0);
    }


    @Test
    public void overdrawOverdraftAccountAboveLimit() {
        assertTrue(overdraftAccount.withdraw(OverdraftAccount.MAX_OVERDRAFT_LIMIT +
                                             overdraftAccount.getBalance()+100) < 0);
    }

    @Test
    public void checkCollectedFeesWhenWithdrawingFromSavingsAccount() {
	    assertTrue(savingsAccount.withdraw(200) > 0);
	    assertEquals(4, savingsAccount.getCollectedFees());
	    assertEquals(796, savingsAccount.getBalance());
        assertTrue(savingsAccount.withdraw(45) > 0);
        assertEquals(750, savingsAccount.getBalance());
        assertEquals(5, savingsAccount.getCollectedFees());
    }
}
