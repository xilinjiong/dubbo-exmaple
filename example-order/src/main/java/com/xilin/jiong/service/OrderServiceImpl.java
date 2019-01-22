package com.xilin.jiong.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.xilin.jiong.bean.Order;
import com.xilin.jiong.bean.OrderVo;
import com.xilin.jiong.bean.UserVo;
import com.xilin.jiong.mapper.OrderMapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单的实现类〉
 *
 * @author Administrator
 * @create 2019/1/22
 * @since 1.0.0
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Resource
    private OrderMapper orderMapper;

    @Override
    public OrderVo getOrder(String orderNo) {

        Example example = new Example(Order.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("orderNo",orderNo);

        List<Order> orders = orderMapper.selectByExample(example);

        if (null!=orders&&orders.size()>0){

            Order order = orders.get(0);

            long userId = order.getUserId();

           UserVo userVo = userService.getUser(userId);

           OrderVo orderVo = new OrderVo();

           orderVo.setUserVo(userVo);
           orderVo.setPayMoeny(order.getPayMoney());
           orderVo.setCdate(order.getCdate());
           orderVo.setOrderNo(orderNo);

           return orderVo;

        }
        return null;
    }
}
