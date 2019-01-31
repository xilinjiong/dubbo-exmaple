package com.xilin.jiong;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@EnableDubbo
@MapperScan(value = {"com.xilin.jiong.mapper"})
@ImportResource(locations = {"classpath:spring/consumer.xml"})
@SpringBootApplication
public class ExampleAddressApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleAddressApplication.class, args);
    }

}

