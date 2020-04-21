package com.dominikyang.lastdance.user.business.controller;

import com.dominikyang.lastdance.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 16:12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;


}
