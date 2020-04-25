package com.dominikyang.lastdance.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 22:51
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class BusinessOAuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(BusinessOAuth2Application.class,args);
    }
}
