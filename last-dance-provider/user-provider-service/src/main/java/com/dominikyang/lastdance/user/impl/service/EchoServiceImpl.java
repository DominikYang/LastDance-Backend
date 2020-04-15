package com.dominikyang.lastdance.user.impl.service;

import com.dominikyang.lastdance.user.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author Wei yuyaung
 * @date 2020.04.15 17:12
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "hello dubbo " + string;
    }
}
