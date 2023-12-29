package com.kyu.app.repository;

import com.kyu.app.dao.UserDO;
import com.kyu.app.mapper.UserMapper;
import com.kyu.app.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author kyu.yzf
 * @date 2023/12/27 19:51
 */
@Repository
public class UserRepositoryImpl implements UserRespository{

    @Resource
    private UserMapper userMapper;

    @Override
    public void add(User user) {
        UserDO userDO = toDO(user);
        userMapper.insert(userDO);
    }

    @Override
    public User query(String id) {
        UserDO userDO = userMapper.selectByPrimaryKey(id);
        User model = toModel(userDO);
        return model;
    }

    public static UserDO toDO(User user) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        return userDO;
    }

    public static User toModel(UserDO userDO) {
        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        return user;
    }
}
