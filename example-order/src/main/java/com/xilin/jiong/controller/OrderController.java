package com.xilin.jiong.controller;

import com.xilin.jiong.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单的相关实现〉
 *
 * @author Administrator
 * @create 2019/1/22
 * @since 1.0.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @ResponseBody
    @GetMapping(value = "/order/{orderNo}")
    public Object getOrder(@PathVariable String orderNo) {
        return orderService.getOrder(orderNo);
    }
}
