package com.ms.farmconnect.Servlet;

import com.ms.farmconnect.Dao.UserDaoImp;  // Import the correct implementation
import com.ms.farmconnect.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private UserDaoImp userDAO = new UserDaoImp();  // Instantiate the correct DAO implementation

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");

        // Check if the mobile number already exists in the database
        boolean isUserExists = userDAO.isUserExist(mobile);  // Call method to check if the user exists

        if (isUserExists) {
            // If the user already exists, send a response to the client
            response.sendRedirect("register.html?error=userExists"); // Send an error parameter indicating user already exists
        } else {
            // Create a new User object
            User user = new User(name, mobile, password);

            // Save user in the database
            boolean isUserSaved = userDAO.addUser(user);  // Call addUser method

            if (isUserSaved) {
                // Redirect to login page with success message
                response.sendRedirect("farmerdashboard.html?registration=success");
            } else {
                // Redirect to registration page with error
                response.sendRedirect("register.html?error=registrationFailed");
            }
        }
    }
}
