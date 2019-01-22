package com.xilin.jiong.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈订单数据〉
 *
 * @author Administrator
 * @create 2019/1/22
 * @since 1.0.0
 */
@Data
@ToString
public class OrderVo implements Serializable {
    private String orderNo;

    private UserVo userVo;

    private Date cdate;

    private BigDecimal payMoeny;
}
