package com.dominikyang.lastdance.business.controller;

import com.dominikyang.lastdance.provider.api.UserService;
import com.dominikyang.lastdance.provider.domain.User;
import com.domonikyang.lastdance.commons.result.CodeStatus;
import com.domonikyang.lastdance.commons.result.ResponseResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wei yuyaung
 * @date 2020.04.21 18:31
 */
@RestController
@RequestMapping("profile")
public class ProfileController {
    @Reference(version = "1.0.0")
    UserService userService;

    @GetMapping("info/{userName}")
    public ResponseResult<User> loadUserInfo(@PathVariable String userName){
        User user = userService.get(userName);
        return new ResponseResult<User>(CodeStatus.OK,"查询用户信息",user);
    }
}
