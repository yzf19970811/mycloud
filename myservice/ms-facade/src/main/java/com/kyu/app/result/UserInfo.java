package com.kyu.app.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kyu.yzf
 * @date 2023/12/27 20:04
 */
@Data
public class UserInfo implements Serializable {

    private String userId;

    private String userName;

    private String password;

    private String phone;
}
