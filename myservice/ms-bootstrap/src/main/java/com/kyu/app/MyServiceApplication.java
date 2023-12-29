package com.kyu.app;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author kyu.yzf
 * @date 2023/12/22 22:07
 */
@SpringBootApplication
@EnableDubbo
@MapperScan(basePackages = "com.kyu.app.mapper")
public class MyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyServiceApplication.class);
    }
}
