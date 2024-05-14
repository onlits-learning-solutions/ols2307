package ols2307;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Que515 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        Connection connection = null;
        try {
            int accountNumber = Integer.parseInt(request.getParameter("account-number"));
            connection = DriverManager.getConnection("jdbc:mariadb://localhost/fiction_bank_2307", "ols2307",
                    "ols2307");
            String sql = "SELECT balance FROM account WHERE account_number=" +
                    accountNumber;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next())
                out.println("Account Balance: " + resultSet.getFloat("balance"));
            else
                out.println("Invalid account!");
        } catch (SQLException exception) {
            out.println("Fatal Error: Contact support.");
            out.println(exception);
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException exception) {
                out.println(exception);
            }
        }
    }
}
