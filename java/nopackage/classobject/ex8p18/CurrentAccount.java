// Sub/Child/Derived class

public class CurrentAccount extends Account {
    void initialize() {
        customerName = "Atul Kumar";
        accountNumber = "10398";
        accountType = "CA";
        balance = 15000.00F;
    }

    void checkMinimumBalance(float minimumBalance, float penalty) {
        if (balance < minimumBalance)
            balance -= penalty;
    }
}
