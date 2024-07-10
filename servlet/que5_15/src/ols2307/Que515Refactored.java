package ols2307;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Que515Refactored extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        int accountNumber = Integer.parseInt(request.getParameter("account-number"));
        Account account = Account.getAccount(accountNumber);
        if (account != null)
            out.println("<h1>Account Balance: " + account.getBalance() + "</h1>");
        else
            out.println("<h1>Invalid Account!</h1>");
    }
}
