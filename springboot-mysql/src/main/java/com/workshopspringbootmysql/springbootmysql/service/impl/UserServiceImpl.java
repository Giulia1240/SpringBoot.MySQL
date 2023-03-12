package com.workshopspringbootmysql.springbootmysql.service.impl;

import com.workshopspringbootmysql.springbootmysql.model.User;
import com.workshopspringbootmysql.springbootmysql.repository.UserRepository;
import com.workshopspringbootmysql.springbootmysql.service.UserService;
import com.workshopspringbootmysql.springbootmysql.service.exception.UserIdMismatchException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) throws UserIdMismatchException {

        if (user.getId() ==null) {
            throw new UserIdMismatchException();
        }

        User existingUser = userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());

        return userRepository.save(existingUser);

    }
    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}


//