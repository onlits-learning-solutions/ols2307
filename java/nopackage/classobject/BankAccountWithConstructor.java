public class BankAccountWithConstructor {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private float accountBalance;

    BankAccountWithConstructor() {              //Constructor Method
        depositorName = "Ashutosh Kumar";
        accountNumber = "12345";
        accountType = "SA";
        accountBalance = 10000.00F;
    }

    void deposit(float amount) {
        accountBalance += amount;
    }

    void withdraw(float amount) {
        if(accountBalance >= amount)
            accountBalance -= amount;
        else
            System.out.println("Transaction Declined!");
    }

    void displayBalance() {
        System.out.println("Depositor Name: " + depositorName);
        // System.out.println("Account Name: " + accountNumber);
        // System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccountWithConstructor bankAccount = new BankAccountWithConstructor();
        System.out.println("After initializing:");
        bankAccount.displayBalance();
        // Deposit 5000.00
        System.out.println("\nAfter depositing 5000.00:");
        bankAccount.deposit(5000.00F);
        bankAccount.displayBalance();
        // Withdraw 7000.00
        System.out.println("\nAfter withdrawing 7000.00:");
        bankAccount.withdraw(7000.00F);
        bankAccount.displayBalance();
        // Checking for transaction declined
        System.out.println("\nTrying to withdraw 10000.00:");
        bankAccount.withdraw(10000.00F);
        bankAccount.displayBalance();
    }
}
