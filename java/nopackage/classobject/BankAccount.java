public class BankAccount {
    private String depositorName;
    private String accountNumber;
    private String accountType;
    private float accountBalance;

    void initialize() {
        depositorName = "Ashutosh Kumar";
        accountNumber = "12345";
        accountType = "SA";
        accountBalance = 10000.00F;
    }

    void deposit() {

    }

    void withdraw() {

    }

    void displayBalance() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Name: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.initialize();
        bankAccount.displayBalance();
    }
}

