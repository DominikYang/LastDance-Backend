package com.dominikyang.lastdance.user.service;

import com.dominikyang.lastdance.user.api.UserService;
import com.dominikyang.lastdance.user.dao.UserDao;
import com.dominikyang.lastdance.user.domain.User;
import com.dominikyang.lastdance.user.domain.UserExample;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 16:45
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> loadUserInfoByUserId(Integer userId) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdEqualTo(userId);
        List<User> users = userDao.selectByExample(userExample);
        return users;
    }

    @Override
    public int insert(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(user.getUserName());
        List<User> users = userDao.selectByExample(userExample);
        if(users.size() > 0){
            return -1;
        }

        user.setStatus(0);
        userDao.insert(user);
        return 0;
    }

    @Override
    public User get(String userName) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(userName);
        List<User> users = userDao.selectByExample(userExample);
        if(users.size() != 1){
            return null;
        }
        return users.get(0);
    }
}
