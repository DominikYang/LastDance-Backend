package com.dominikyang.lastdance.business.controller;

import com.dominikyang.lastdance.provider.api.EchoService;
import com.domonikyang.lastdance.commons.result.ResponseResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wei yuyaung
 * @date 2020.04.15 17:37
 */
@RestController
@RequestMapping("/echo")
public class EchoController {

    @Reference(version = "1.0.0")
    EchoService echoService;

    @GetMapping("{string}")
    public ResponseResult<String> echo(@PathVariable String string){
        String echo = echoService.echo(string);
        return new ResponseResult<String>(HttpStatus.OK.value(),"接收消息成功",echo);
    }
}
