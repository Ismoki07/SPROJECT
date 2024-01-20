package com.example.SPROJECT.services;

import com.example.SPROJECT.models.User;

import java.util.List;

public interface UserService {

    User addUser(User user);

    void deleteUser(User user);

    void deleteById(Long id);

    List<User> getAllUsers();
}
