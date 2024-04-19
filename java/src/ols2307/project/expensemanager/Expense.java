package ols2307.project.expensemanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Expense {
    private String name = null;
    private String category = null;

    public void setExpense(Expense expense) {
        // Connection connection = new Connection();
        try {
            Connection con = DriverManager.getConnection("");
        } catch (SQLException ex) {

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
