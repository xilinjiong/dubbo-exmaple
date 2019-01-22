package com.xilin.jiong;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@MapperScan(value = {"com.xilin.jiong.mapper"})
public class ExmapleUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExmapleUserApplication.class, args);
    }

}

