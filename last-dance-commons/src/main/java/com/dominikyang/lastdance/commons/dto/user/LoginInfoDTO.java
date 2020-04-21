package com.dominikyang.lastdance.commons.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Wei yuyaung
 * @date 2020.04.18 23:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginInfoDTO {
    String name;
    String avatar;
    String token;
}
