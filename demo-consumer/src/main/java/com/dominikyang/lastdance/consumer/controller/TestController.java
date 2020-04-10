package com.dominikyang.lastdance.consumer.controller;

import com.dominikyang.lastdance.consumer.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Wei yuyaung
 * @date 2020.04.10 17:32
 */
@RestController
public class TestController {
    private final RestTemplate restTemplate;

    private final EchoService echoService;

    @Autowired
    public TestController(RestTemplate restTemplate, EchoService echoService) {
        this.restTemplate = restTemplate;
        this.echoService = echoService;
    }

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable String str) {
        // 使用服务名请求服务提供者
        return echoService.echo(str);
    }
}
