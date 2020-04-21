package com.dominikyang.lastdance.user.api;

import com.dominikyang.lastdance.user.domain.User;

import java.util.List;

public interface UserService {
    /**
     * description: 通过用户id获取用户信息
     * @author: Wei Yuyang
     * @time: 2020.04.16
     */
    List<User> loadUserInfoByUserId(Integer userId);

    /**
     * description: 根据用户名获取用户信息
     * @author: Wei Yuyang
     * @time: 2020.04.21
     */
    User get(String userName);

    /**
     * description: 插入用户信息
     * @author: Wei Yuyang
     * @time: 2020.04.16
     */
    int insert(User user);
}
