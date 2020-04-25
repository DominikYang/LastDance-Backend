package com.dominikyang.lastdance.provider.service;

import com.dominikyang.lastdance.provider.api.UserService;
import com.dominikyang.lastdance.provider.dao.UserDao;
import com.dominikyang.lastdance.provider.domain.User;
import com.dominikyang.lastdance.provider.domain.UserExample;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 16:45
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

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

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setStatus(0);
        userDao.insertSelective(user);
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
