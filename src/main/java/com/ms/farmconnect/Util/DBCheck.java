
package com.ms.farmconnect.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCheck {

    public static void main(String[] args) {
        // JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/FarmConnect";  // Update this with your database URL
        String user = "root";  // Update with your MySQL username
        String password = "Ayush@3755";  // Update with your MySQL password

        // Establish the connection
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Database connected successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}
