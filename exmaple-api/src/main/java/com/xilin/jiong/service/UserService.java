package com.xilin.jiong.service;

import com.xilin.jiong.bean.UserVo;

import java.util.List;

public interface UserService {
    UserVo getUser(Long id);
    List<UserVo> queryList();
}
