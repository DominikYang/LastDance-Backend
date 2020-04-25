package com.dominikyang.lastdance.business.service;

import com.dominikyang.lastdance.provider.api.UserService;
import com.google.common.collect.Lists;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wei yuyaung
 * @date 2020.04.16 22:53
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("USER");

        com.dominikyang.lastdance.provider.domain.User user = userService.get(userName);

        // 用户名匹配
        if (user != null) {
            grantedAuthorities.add(grantedAuthority);
            return new User(user.getUserName(), user.getPassword(), grantedAuthorities);
        }
        // 用户名不匹配
        else {
            return null;
        }
    }
}
