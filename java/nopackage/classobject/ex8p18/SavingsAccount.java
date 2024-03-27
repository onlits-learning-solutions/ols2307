// Sub/Child/Derived class

public class SavingsAccount extends Account {
    void initialize() {
        customerName = "Abbas Ali";
        accountNumber = "10056";
        accountType = "SA";
        balance = 10000.00F;
    }

    void calculateInterest(float rate, int month) {
        float interest = (balance * rate * month / 12) / 100;
        balance += interest;
    }
}