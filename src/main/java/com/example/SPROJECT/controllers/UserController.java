package com.example.SPROJECT.controllers;

import com.example.SPROJECT.models.User;
import com.example.SPROJECT.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/create")
    @ResponseBody
    public User createUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteUser(@PathVariable("id") Long userId) {
        userService.deleteById(userId);
    }
}
