/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ms.farmconnect.Servlet;

import com.ms.farmconnect.Dao.UserDaoImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
     private UserDaoImp userDAO = new UserDaoImp(); 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");

        boolean isValidUser = userDAO.isValidUser(mobile, password);  // Call isValidUser method from UserDaoImp

        if (isValidUser) {
            response.sendRedirect("farmerdashboard.html?login=success");
        } else {
            // Redirect back to login page with error message
            response.sendRedirect("login.html?error=invalidCredentials");
        }
    }
}

