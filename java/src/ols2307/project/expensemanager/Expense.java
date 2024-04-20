package ols2307.project.expensemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Expense {
    private String name = null;
    private String category = null;

    public static void setExpense(String name, String category) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/expense_manager_2307",
                    "ols2307", "ols2307");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO expense VALUES('" + name + "', '" + category + "')";
            statement.executeUpdate(sql);
            System.out.println("Aal is well!");
        } catch (SQLException exception) {
            System.out.println(exception);
        }
    }

    public ArrayList<Expense> getExpenses() {
        ArrayList<Expense> expenses = new ArrayList<Expense>();

        return expenses;
    }

    public Expense getExpense(String name) {
        Expense expense = new Expense();

        return expense;
    }

    public void removeExpense(String name) {

    }

    public void updateExpense(String name, Expense expense) {

    }

}
