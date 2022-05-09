package com.example.mybatisspring.controller;

import com.example.mybatisspring.bean.User;
import com.example.mybatisspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author summer
 * @date 2022/5/9 16:55
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    public User query(User user) {
        return userService.getByAccountAndPassword(user);
    }
}
