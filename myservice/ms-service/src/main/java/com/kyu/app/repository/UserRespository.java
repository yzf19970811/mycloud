package com.kyu.app.repository;

import com.kyu.app.model.User;

/**
 * @author kyu.yzf
 * @date 2023/12/27 19:54
 */
public interface UserRespository {

    void add(User user);

    User query(String id);
}
