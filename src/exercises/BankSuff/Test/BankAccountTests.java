package exercises.BankSuff.Test;

import exercises.BankSuff.Accounts.BankAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BankAccountTests {
//    has-a's
//    accountNumber
//    balance
//    owner (s) - Joint?
//
//    type - checking, savings
//
//
//    can-do's
//    deposit
//    withdraw
//    transfer
//    acrueInterest

    private BankAccount ba;
    private int accountNo;

    @Before
    public void makeBankAccount (){
        BankAccount ba = new BankAccount(accountNo);
    }

    @Test
    public void testSimpleDeposit(){
        ba.deposit(1);
        assertEquals(1, ba.getBalance(), 0.000);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDepositNegativeValue(){
        ba.deposit(-2);
        fail("Should not be able to deposit a negative amount");
    }

    @Test
    public void testSimpleWithdrawal(){
        ba.withdrawal(1);
        assertEquals(1, ba.getBalance(), 0.000);
    }

}
