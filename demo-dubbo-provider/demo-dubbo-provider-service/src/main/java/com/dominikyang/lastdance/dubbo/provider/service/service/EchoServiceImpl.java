package com.dominikyang.lastdance.dubbo.provider.service.service;

import com.dominikyang.lastdance.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Wei yuyaung
 * @date 2020.04.12 17:38
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {

    @Override
    public String echo(String string) {
        return "Echo Hello Dubbo " + string;
    }

    @Override
    public String echo2(String string) {
        return "Echo Hello Dubbo " + string;
    }
}
