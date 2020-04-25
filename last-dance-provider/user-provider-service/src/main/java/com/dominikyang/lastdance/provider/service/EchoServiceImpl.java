package com.dominikyang.lastdance.provider.service;

import com.dominikyang.lastdance.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

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
