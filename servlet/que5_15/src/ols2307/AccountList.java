package ols2307;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AccountList extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        ArrayList<Account> accounts = new ArrayList<Account>();
        accounts = Account.getAccounts();
        out.println("<h1>List of Accounts</h1>");
        out.println("<table border=1>");
        out.println("<tr>");
        out.println("<th>Account Number</th>");
        out.println("<th>Customer Name</th>");
        out.println("<th>Balance</th>");
        for (Account account : accounts) {
            out.println("<tr>");
            out.println("<td>" + account.getAccountNumber() + "</td>");
            out.println("<td>" + account.getCustomerName() + "</td>");
            out.println("<td>" + account.getBalance() + "</td>");
            out.println("</tr>");
        }
        out.println("</table>");
    }
}
