package ols2307.project.expensemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Expense {
    String name = null;
    String category = null;

    Expense() {
    } // No argument constructor

    Expense(String name, String category) { // Parameterized constructor
        this.name = name;
        this.category = category;
    }

    public static void setExpense(String name, String category) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/expense_manager_2307",
                    "ols2307", "ols2307");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO expense VALUES('" + name + "', '" + category + "')";
            statement.executeUpdate(sql);
            System.out.println("Expense Created!");
            connection.close();
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

    public static ArrayList<Expense> getExpenses() {
        ArrayList<Expense> expenses = new ArrayList<Expense>();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/expense_manager_2307",
                    "ols2307", "ols2307");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM expense";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name") + "\t" + resultSet.getString("category"));
            }
            connection.close();
        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return expenses;
    }

    public static Expense getExpense(String name) {
        Expense expense = null;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/expense_manager_2307",
                    "ols2307", "ols2307");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM expense WHERE name='" + name + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                expense = new Expense(resultSet.getString("name"), resultSet.getString("category"));
            }
        } catch (SQLException exception) {
            System.out.println(exception);
        }
        return expense;
    }

    public static void removeExpense(String name) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/expense_manager_2307",
                    "ols2307", "ols2307");
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM expense WHERE name='" + name + "'";
            statement.executeUpdate(sql);
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

    public static void updateExpense(String searchValue, String name, String category) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/expense_manager_2307",
                    "ols2307", "ols2307");
            String sql = "UPDATE expense SET name=?, category=? WHERE name=?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, category);
            preparedStatement.setString(3, searchValue);
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

}
