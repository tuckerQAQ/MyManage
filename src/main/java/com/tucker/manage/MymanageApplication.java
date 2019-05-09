package com.tucker.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.tucker.manage.mapper")
@SpringBootApplication
public class MymanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymanageApplication.class, args);
    }

}