package com.kyu.app.service;

import com.kyu.app.BizFacadeService;
import com.kyu.app.UserFacadeService;
import com.kyu.app.result.UserInfo;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author kyu.yzf
 * @date 2023/12/30 11:35
 */
@Service
public class WebServiceImpl implements WebService{

    @DubboReference
    private UserFacadeService userFacadeService;

    @DubboReference
    private BizFacadeService bizFacadeService;

    @Override
    public UserInfo queryUserInfo(String userId) {
        return userFacadeService.queryUserInfo(userId);
    }

    @Override
    public String queryBizInfo() {
        return bizFacadeService.query();
    }
}
