package money_operations_example;

public class Transaction {

    private String type;
    private Account account;
    private double amount;

    public Transaction(String type, Account account, double amount) {
        this.type = type;
        this.account = account;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
