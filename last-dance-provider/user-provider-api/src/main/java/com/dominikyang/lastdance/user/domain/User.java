package com.dominikyang.lastdance.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    /**
     * 用户编号：主键/自增

     */
    private Integer id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户电话
     */
    private String phone;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 博客主页
     */
    private String blogHome;

    /**
     * QQ
     */
    private String qqNumber;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 账户状态：正常/封禁
     */
    private Integer status;

    private static final long serialVersionUID = 1L;
}