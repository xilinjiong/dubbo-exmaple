package com.xilin.jiong.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.xilin.jiong.bean.User;
import com.xilin.jiong.bean.UserVo;
import com.xilin.jiong.mapper.UserMapper;
import org.apache.commons.beanutils.BeanUtils;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户的相关业务操作〉
 *
 * @author Administrator
 * @create 2019/1/21
 * @since 1.0.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserVo getUser(Long id) {
       User user = userMapper.selectByPrimaryKey(id);
       UserVo userVo = new UserVo();
        try {
            BeanUtils.copyProperties(userVo,user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return userVo;
    }

    @Override
    public List<UserVo> queryList() {
        return null;
    }
}
