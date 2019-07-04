package money_operations_example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Account {
    private int accountNumber;
    private double balance;
    public List<Transaction> transactions;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        transactions = new ArrayList<>();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber == account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    public void transfer(double amount, Account payee){
        this.balance -= amount;
        transactions.add(new Transaction("Debit", payee, amount));
        payee.setBalance(payee.getBalance()+amount);
        payee.transactions.add(new Transaction("Credit", this, amount));
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public List<Transaction> getTransactions(String type, Account account) {
        List<Transaction> relatedTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getType() == type && transaction.getAccount() == account) {
                relatedTransactions.add(transaction);
            }
        }return relatedTransactions;
    }
}
