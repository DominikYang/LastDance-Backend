package com.dominikyang.lastdance.user.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * role
 * @author 
 */
@Data
public class Authority implements Serializable {
    /**
     * 角色编号
     */
    private Integer id;

    /**
     * 角色名/角色类型
     */
    private String name;

    private static final long serialVersionUID = 1L;
}