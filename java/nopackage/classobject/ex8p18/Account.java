public class Account {
    protected String customerName;
    protected String accountNumber;
    protected String accountType;
    protected float balance;

    void deposit(float amount) {
        balance += amount;
    }

    float getBalance()
    {
        return balance;
    }
}
