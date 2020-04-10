package com.dominikyang.lastdance.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Wei yuyaung
 * @date 2020.04.10 17:29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class DemoConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoConsumerApplication.class,args);
    }
}
