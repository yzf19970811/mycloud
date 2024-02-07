package com.kyu.app.service;

import com.kyu.app.result.UserInfo;

/**
 * @author kyu.yzf
 * @date 2023/12/30 11:50
 */
public interface WebService {

    UserInfo queryUserInfo(String userId);

    String queryBizInfo();
}
