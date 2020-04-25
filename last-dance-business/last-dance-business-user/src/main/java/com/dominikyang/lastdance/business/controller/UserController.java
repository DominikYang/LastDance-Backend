package com.dominikyang.lastdance.business.controller;

import com.dominikyang.lastdance.business.vo.RegisterVO;
import com.dominikyang.lastdance.provider.api.UserService;
import com.dominikyang.lastdance.provider.domain.User;
import com.domonikyang.lastdance.commons.result.CodeStatus;
import com.domonikyang.lastdance.commons.result.ResponseResult;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 16:12
 */
@RestController
public class UserController {

    @Reference(version = "1.0.0")
    UserService userService;

    @PostMapping("/register")
    public ResponseResult<User> register(@RequestBody RegisterVO registInfo){
        User user = new User();
        user.setUserName(registInfo.getUserName());
        user.setPassword(registInfo.getPassword());
        user.setPhone(registInfo.getPhone());
        int insert = userService.insert(user);
        if(insert == 0){
            return new ResponseResult<>(CodeStatus.OK,"注册成功",user);
        }else {
            return new ResponseResult<>(CodeStatus.ILLEGAL_REQUEST,"注册失败",user);
        }
    }
}
