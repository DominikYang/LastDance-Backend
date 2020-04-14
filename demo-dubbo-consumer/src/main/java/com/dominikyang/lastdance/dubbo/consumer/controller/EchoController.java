package com.dominikyang.lastdance.dubbo.consumer.controller;

import com.dominikyang.lastdance.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wei yuyaung
 * @date 2020.04.12 17:58
 */
@RestController
public class EchoController {
    @Reference(version = "1.0.0")
    private EchoService echoService;
    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return echoService.echo(string);
    }
}
