package com.kyu.app.facade;

import com.kyu.app.UserFacadeService;
import com.kyu.app.result.UserInfo;
import com.kyu.app.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author kyu.yzf
 * @date 2023/12/22 22:50
 */
@DubboService
public class UserFacadeServiceImpl implements UserFacadeService {

    @Resource
    private UserService userService;

    @Override
    public String queryUserInfo() {
        return "yuzhifa";
    }

    @Override
    public void addUserInfo(UserInfo userInfo) {
        userService.addUser(userInfo);
    }

    @Override
    public UserInfo queryUserInfo(String id) {
        return userService.query(id);
    }
}
