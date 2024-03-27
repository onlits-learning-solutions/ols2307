// Super/Parent/Base Class

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

    void withdraw(float amount) {
        if(balance >= amount)
            balance -= amount;
        else
            System.out.println("Transaction declined!");
    }
}
