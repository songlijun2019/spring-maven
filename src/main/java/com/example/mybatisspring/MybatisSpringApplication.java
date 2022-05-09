package com.example.mybatisspring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.mybatisspring.mapper")
@SpringBootApplication
public class MybatisSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisSpringApplication.class, args);
    }

}
