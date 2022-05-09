package com.example.mybatisspring.service;

import com.example.mybatisspring.bean.User;

public interface UserService {
    public User getByAccountAndPassword(User user);
}
