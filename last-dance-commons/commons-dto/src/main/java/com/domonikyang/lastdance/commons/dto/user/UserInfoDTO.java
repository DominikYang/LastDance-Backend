package com.domonikyang.lastdance.commons.dto.user;

import lombok.Data;

/**
 * @author Wei yuyaung
 * @date 2020.04.21 20:06
 */
@Data
public class UserInfoDTO {
    private Integer id;
    private String realName;
    private String qqNumber;
    private String wechatNumber;
}
