package com.kyu.app.service;

import com.kyu.app.model.User;
import com.kyu.app.repository.UserRespository;
import com.kyu.app.result.UserInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author kyu.yzf
 * @date 2023/12/27 19:59
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRespository userRespository;

    @Override
    public void addUser(UserInfo userInfo) {
        User user = new User();
        BeanUtils.copyProperties(userInfo, user);
        userRespository.add(user);
    }

    @Override
    public UserInfo query(String userId) {
        User user = userRespository.query(userId);
        return user.toVo();
    }
}
