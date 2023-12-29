package com.kyu.app;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author kyu.yzf
 * @date 2023/12/29 22:55
 */
@SpringBootApplication
@EnableDubbo
public class MyWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyWebApplication.class);
    }
}
