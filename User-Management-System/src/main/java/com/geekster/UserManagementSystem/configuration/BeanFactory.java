package com.geekster.UserManagementSystem.configuration;

import com.geekster.UserManagementSystem.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> UserList(){
        return new ArrayList<>();
    }
}
