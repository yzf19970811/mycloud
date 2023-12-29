package com.kyu.app.model;

import com.kyu.app.result.UserInfo;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author kyu.yzf
 * @date 2023/12/27 19:51
 */
@Data
public class User {

    private String userId;

    private String userName;

    private String password;

    private String phone;

    public UserInfo toVo() {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(this, userInfo);
        return userInfo;
    }
}
