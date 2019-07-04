package money_operations_example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AccountTest {

    private Account payer;
    private Account payee;

    @Before
    public void setUp() throws Exception{
        payee = new Account(1);
        payer = new Account(2);
        payer.setBalance(200);
    }

    @Test
    public void testTransferWhenPayerBalanceShouldBeReducedByAmountOfTransaction(){
        payer.transfer(50,payee);
        assertEquals(150, payer.getBalance(), 0);
    }

    @Test
    public void testTransferWhenPayeeBalanceShouldBeIncreasedByAmountOfTransaction(){
        payer.transfer(50,payee);
        assertEquals(150, payee.getBalance(), 0);
    }

    @Test
    public void testTransferWhenTransactionShouldBeRecordedAsDebitTransaction(){

        payer.transfer(50,payee);
        assertEquals(1,payer.transactions.size());
        Transaction transaction = payer.transactions.get(0);
        assertEquals("Debit", transaction.getType());
        assertEquals(payee, transaction.getAccount());
        assertEquals(50, transaction.getAmount(),0);

    }

    @Test
    public void testTransferTransactionShouldBeRecordedAsCreditInPayeeTransactionHistory(){

        payer.transfer(50,payee);

        assertEquals(1,payee.transactions.size());
        Transaction transaction = payee.transactions.get(0);
        assertEquals("Credit", transaction.getType());
        assertEquals(payer, transaction.getAccount());
        assertEquals(50, transaction.getAmount(),0);
    }

    @Test
    public void testTransactionHistoryShouldBeAbleToQueryToOtFromAccount(){
        payer.transactions.add(new Transaction("Credit", payee, 100));
        payer.transactions.add(new Transaction("Debit", payee, 100));
        payer.transactions.add(new Transaction("Credit", payee, 100));
        payer.transactions.add(new Transaction("Debit", new Account(3), 100));

        List<Transaction> payerResults = payer.getTransactions("Debit", payee);
        assertEquals(1,payerResults.size());
    }

}