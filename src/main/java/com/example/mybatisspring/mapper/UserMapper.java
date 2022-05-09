package com.example.mybatisspring.mapper;

import com.example.mybatisspring.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getByAccountAndPassword(User user);
}
