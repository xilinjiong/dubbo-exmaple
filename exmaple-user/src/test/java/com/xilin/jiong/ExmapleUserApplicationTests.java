package com.xilin.jiong;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.github.pagehelper.PageHelper;
import com.xilin.jiong.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * dubbo 结合springboot时，单元测试需要在@SpringBootTest(classes = 项目的启动类)
 * 〈〉
 *
 * @return:
 * @since: 1.0.0
 * @Author:Administrator
 * @Date: 2019/1/21 22:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ExmapleUserApplication.class)
public class ExmapleUserApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void selectOne(){
        userMapper.selectByPrimaryKey(3L);
    }

    @Test
    public void selectByPage(){
        PageHelper.startPage(2,2);
        userMapper.selectAll();
    }

}

