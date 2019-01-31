package com.xilin.jiong.service;

import com.xilin.jiong.bean.AddressVo;

import java.util.List;

public interface AddressService {
    List<AddressVo> getAddressList(Long uid);
}
