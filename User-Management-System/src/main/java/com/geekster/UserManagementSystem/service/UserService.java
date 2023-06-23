package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    public String addUser(User user) {
        List<User> userList = getUsers();
        userList.add(user);
        return "User added successfully";
    }

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    public User getUserById(Integer userId) {
        List<User> userList = getUsers();
        return userList.get(userId);
    }

    public String updateUserById(Integer userId) {
        List<User> userList = getUsers();
        for (User user : userList) {
            if(user.getUserId().equals(userId)){
                user.setUserName("Apx");
                user.setUserId(5);
                user.setName("Sachin");
            }
        }
        return "User update successfully";

    }

    public String deleteUserById(Integer userId) {
        List<User> userList = getUsers();
        userList.remove((int)userId);
        return "user removed successfully";
    }
}
