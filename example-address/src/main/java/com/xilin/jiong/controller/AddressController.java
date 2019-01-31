package com.xilin.jiong.controller;

import com.xilin.jiong.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈地址实现类〉
 *
 * @author Administrator
 * @create 2019/1/26
 * @since 1.0.0
 */
@RestController
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ResponseBody
    @GetMapping(value = "/address/list")
    public Object getAddressList(Long uid){
        return addressService.getAddressList(uid);
    }
}
