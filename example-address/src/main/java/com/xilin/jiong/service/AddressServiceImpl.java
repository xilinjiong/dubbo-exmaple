package com.xilin.jiong.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xilin.jiong.bean.Address;
import com.xilin.jiong.bean.AddressVo;
import com.xilin.jiong.bean.UserVo;
import com.xilin.jiong.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈地址service实现类〉
 *
 * @author Administrator
 * @create 2019/1/26
 * @since 1.0.0
 */

@Service
public class AddressServiceImpl implements AddressService {

   @Autowired
    private UserService userService;

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<AddressVo> getAddressList(Long uid) {
        Example example = new Example(Address.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("uid");

        List<Address> addressList = addressMapper.selectByExample(example);

        List<AddressVo> addressVoList = new ArrayList<AddressVo>(2);

        AddressVo addressVo = null;

        UserVo userVo = userService.getUser(uid);

        if (addressList!=null&&addressList.size()>0){
            for (Address address:addressList){
                addressVo = new AddressVo();
                addressVo.setId(address.getId());
                addressVo.setProvince(address.getProvince());
                addressVo.setCity(address.getCity());
                addressVo.setPlace(address.getPlace());
                addressVo.setUid(uid);
                addressVo.setUserVo(userVo);
                addressVoList.add(addressVo);
            }
        }

        return addressVoList;
    }
}
