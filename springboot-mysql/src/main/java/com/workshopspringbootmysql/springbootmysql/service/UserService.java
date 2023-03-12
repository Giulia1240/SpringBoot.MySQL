package com.workshopspringbootmysql.springbootmysql.service;

import com.workshopspringbootmysql.springbootmysql.model.User;
import com.workshopspringbootmysql.springbootmysql.service.exception.UserIdMismatchException;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updateUser(User user) throws UserIdMismatchException;
    void deleteUser(Long userId);
}
///