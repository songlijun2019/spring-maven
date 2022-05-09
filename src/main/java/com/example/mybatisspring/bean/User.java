package com.example.mybatisspring.bean;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author summer
 * @date 2022/5/9 16:40
 */
@Data
public class User {
    private Long id;
    private String account;
    private String password;
    private String name;

    private Long creatorId;
    private String creatorName;
    private LocalDateTime createTime;

    private Long updateUserId;
    private String updateUserName;
    private LocalDateTime updateTime;
}
