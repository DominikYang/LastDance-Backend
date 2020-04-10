package com.dominikyang.lastdance.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Wei yuyaung
 * @date 2020.04.10 17:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoProviderApplication.class,args);
    }
}
