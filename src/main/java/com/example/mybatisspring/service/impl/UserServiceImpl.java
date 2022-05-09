package com.example.mybatisspring.service.impl;

import com.example.mybatisspring.bean.User;
import com.example.mybatisspring.mapper.UserMapper;
import com.example.mybatisspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author summer
 * @date 2022/5/9 16:53
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User getByAccountAndPassword(User user) {
        return userMapper.getByAccountAndPassword(user);
    }
}
