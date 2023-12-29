package com.kyu.app;

import com.kyu.app.result.UserInfo;

/**
 * @author kyu.yzf
 * @date 2023/12/22 22:47
 */
public interface UserFacadeService {

    String queryUserInfo();

    void addUserInfo(UserInfo userInfo);

    UserInfo queryUserInfo(String id);
}
