package com.ms.farmconnect.Dao;

import com.ms.farmconnect.Util.DBConnection;
import static com.ms.farmconnect.Util.DBConnection.getConnection;
import com.ms.farmconnect.models.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImp implements UserDAO {
    @Override
  public boolean addUser(User user) {
    String query = "INSERT INTO users (name, mobile_number, password) VALUES (?, ?, ?)";  // Correct column name

    try (Connection connection = DBConnection.getConnection();
         PreparedStatement preparedStatement = connection.prepareStatement(query)) {

        preparedStatement.setString(1, user.getName());
        preparedStatement.setString(2, user.getMobile());  // Assuming user.getMobile() returns the correct mobile number
        preparedStatement.setString(3, user.getPassword());

        int rowsAffected = preparedStatement.executeUpdate();

        return rowsAffected > 0;  // Return true if the user was successfully added
    } catch (SQLException e) {
        e.printStackTrace();
        return false;  // Return false if there was an error
    }
}


    @Override
    public boolean isValidUser(String mobile, String password) {
        String query = "SELECT * FROM users WHERE mobile_number = ? AND password = ?";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, mobile);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            // If there's a result, it means the user exists
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
 
    @Override
    public boolean isUserExist(String mobile) {
        String query = "SELECT * FROM users WHERE mobile_number = ?";  // Query to check if user already exists

        try (Connection connection = getConnection(); 
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, mobile);  // Set the mobile number parameter in the query
            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();  // If the result set has a row, user exists
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
