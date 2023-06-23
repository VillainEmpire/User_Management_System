package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    //add new User in the List
    @PostMapping("users")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }


    //add list of users in the list

    // get all users from the list
    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // get user on the basis of userid
    @GetMapping("users/{userId}")
    public User getUserById(@PathVariable Integer userId)
    {
        return userService.getUserById(userId);
    }

    //  update user info
    @PutMapping("users/{userId}")
    public String updateUserById(@PathVariable Integer userId)
    {
        return userService.updateUserById(userId);
    }

    // delete user from the list
    @DeleteMapping("users/{userId}")
    public String deleteUserById(@PathVariable Integer userId)
    {
        return userService.deleteUserById(userId);
    }
}
