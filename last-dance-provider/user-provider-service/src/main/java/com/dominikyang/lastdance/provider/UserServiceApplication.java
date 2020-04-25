package com.dominikyang.lastdance.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Wei yuyaung
 * @date 2020.04.15 16:28
 */
@SpringBootApplication
@MapperScan("com.dominikyang.lastdance.provider.dao")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }
}
