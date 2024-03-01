public class BankAccountWithConstructor {
    private String depositorName; // instance variable
    private String accountNumber;
    private String accountType;
    private float accountBalance;

    BankAccountWithConstructor() { // Default Constructor
        depositorName = "Some Name";
        accountNumber = "xxxxxxxxxx";
        accountType = "CA";
        accountBalance = 0.0F;
    }

    BankAccountWithConstructor(String depositorName, String accountNumber, String accountType, float accountBalance) { // Parameterized
                                                                                                                       // Constructor
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    BankAccountWithConstructor(BankAccountWithConstructor account) { // Copy Constructor
        depositorName = account.depositorName;
        accountNumber = account.accountNumber;
        accountType = account.accountType;
        accountBalance = account.accountBalance;
    }

    void deposit(float amount) {
        accountBalance += amount;
    }

    void withdraw(float amount) {
        if (accountBalance >= amount)
            accountBalance -= amount;
        else
            System.out.println("Transaction Declined!");
    }

    void displayBalance() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Name: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
        int length = depositorName.length();
    }

    public static void main(String[] args) {
        BankAccountWithConstructor bankAccount = new BankAccountWithConstructor("Ashutosh Kumar", "123456", "SA",
                5000.00F);
        BankAccountWithConstructor secondObject = new BankAccountWithConstructor(bankAccount);
        System.out.println("After initializing:");
        secondObject.displayBalance();
        // Deposit 5000.00
        System.out.println("\nAfter depositing 5000.00:");
        secondObject.deposit(5000.00F);
        secondObject.displayBalance();
        // Withdraw 7000.00
        System.out.println("\nAfter withdrawing 7000.00:");
        secondObject.withdraw(7000.00F);
        secondObject.displayBalance();
        // Checking for transaction declined
        System.out.println("\nTrying to withdraw 10000.00:");
        secondObject.withdraw(10000.00F);
        secondObject.displayBalance();
    }
}
