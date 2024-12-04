package com.ms.farmconnect.Dao;

import com.ms.farmconnect.models.User;

public interface UserDAO {
    boolean addUser(User user);  // Method for adding user
    boolean isValidUser(String mobile, String password);  // Method to validate user
    boolean isUserExist(String mobile);
}

