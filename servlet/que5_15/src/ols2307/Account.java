package ols2307;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String customerName;
    private float balance;

    Account() {
    }

    Account(int accountNumber, String customerName, float balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = balance;
    }

    Account(String customerName, float balance) {
        this.customerName = customerName;
        this.balance = balance;
    }

    int getAccountNumber() { // getter method
        return accountNumber;
    }

    void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    String getCustomerName() {
        return customerName;
    }

    void setBalance(float balance) {
        this.balance = balance;
    }

    float getBalance() {
        return balance;
    }

    static ArrayList<Account> getAccounts() {
        ArrayList<Account> accounts = new ArrayList<Account>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost/fiction_bank_2307", "ols2307",
                    "ols2307");
            statement = connection.createStatement();
            String sql = "SELECT * FROM account";
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                accounts.add(new Account(resultSet.getInt("account_number"), resultSet.getString("customer_name"),
                        resultSet.getFloat("balance")));
            }
        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return accounts;
    }

    static Account getAccount(int accountNumber) {
        Account account = null;
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost/fiction_bank_2307", "ols2307",
                    "ols2307");
            statement = connection.createStatement();
            String sql = "SELECT * FROM account WHERE account_number=" + accountNumber;
            resultSet = statement.executeQuery(sql);
            if (resultSet.next())
                account = new Account(resultSet.getInt("account_number"), resultSet.getString("customer_name"),
                        resultSet.getFloat("balance"));
        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return account;
    }

    void save() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mariadb://localhost/fiction_bank_2307", "ols2307",
                    "ols2307");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO account(customer_name, balance) VALUES('" + customerName + "', " + balance + ")";
            statement.executeUpdate(sql);
        } catch (SQLException exception) {
            System.out.println(exception);
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }
    }
}
