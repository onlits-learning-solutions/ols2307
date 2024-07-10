package ols2307;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CreateAccount extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String customerName = request.getParameter("customer-name");
        float balance = Float.parseFloat(request.getParameter("balance"));
        Account account = new Account(customerName, balance);
        account.save();
        out.println("Account created!");
    }
}
