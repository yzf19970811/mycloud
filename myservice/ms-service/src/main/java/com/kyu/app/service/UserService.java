package com.kyu.app.service;

import com.kyu.app.model.User;
import com.kyu.app.result.UserInfo;

/**
 * @author kyu.yzf
 * @date 2023/12/27 19:59
 */
public interface UserService {

    void addUser(UserInfo user);

    UserInfo query(String userId);
}
