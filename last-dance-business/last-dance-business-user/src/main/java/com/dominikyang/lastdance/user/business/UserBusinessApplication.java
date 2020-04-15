package com.dominikyang.lastdance.user.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wei yuyaung
 * @date 2020.04.15 17:40
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserBusinessApplication.class,args);
    }
}
