// CLIENT CLASS

package ols2307.project.expensemanager;

import java.util.Scanner;

public class ExpenseManager {
    public static void main(String[] args) {
        System.out.println("EXPENSE MANAGER");
        // Expense.setExpense("Premium Conveyance", "Desirable");
        Expense.getExpenses();
        // Expense expense = Expense.getExpense("Conveyance");
        // System.out.println("Name: " + expense.name);
        // System.out.println("Category: " + expense.category);
        Expense.removeExpense("Conveyance");
        // System.out.println("Record deleted!");
        System.out.println("-----------------------");
        Expense.updateExpense("Electricity","Conveyance", "Vital");
        System.out.println("-----------------------");
        Expense.getExpenses();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    }
}
