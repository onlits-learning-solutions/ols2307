public class P8P18Main {
    public static void main(String[] args) {
        System.out.println("Exercise 8.18 from E. Balagurusamy");
        
        System.out.println("Testing savings account:");
        SavingsAccount savingsAccount = new SavingsAccount();       //Concrete and dynamic instantiation
        savingsAccount.initialize();
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(3000.00F);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.calculateInterest(3.0F, 6);
        System.out.println("Balance after interest: " + savingsAccount.getBalance());
        savingsAccount.withdraw(15000);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());

        
        System.out.println("\nTesting current account:");
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.initialize();
        currentAccount.checkMinimumBalance(5000, 100);
        System.out.println("Initial Balance: " + currentAccount.getBalance());
        currentAccount.withdraw(15000);
        currentAccount.checkMinimumBalance(5000, 100);
        System.out.println("Balance after withdrawal: " + currentAccount.getBalance());
        currentAccount.deposit(20000);
        currentAccount.checkMinimumBalance(5000, 100);
        System.out.println("Balance after deposit: " + currentAccount.getBalance());
        //currentAccount.balance = 10000.00F;
    }    
}
