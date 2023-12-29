package com.kyu.app.facade;

import com.kyu.app.BizFacadeService;
import com.kyu.app.mq.MqClient;
import com.kyu.app.redis.RedisClient;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author kyu.yzf
 * @date 2023/12/24 13:29
 */
@DubboService
public class BizFacadeServiceImpl implements BizFacadeService {

    @Resource
    private MqClient mqClient;

    @Resource
    private RedisClient redisClient;

    @Override
    public String query() {
        redisClient.setKV();
        mqClient.sendMsg();
        return "biz service query";
    }
}
