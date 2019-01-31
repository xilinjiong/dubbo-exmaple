package com.xilin.jiong.bean;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈地址的VO类〉
 *
 * @author Administrator
 * @create 2019/1/26
 * @since 1.0.0
 */
@Data
@ToString
public class AddressVo implements Serializable {

    private long id;

    private long uid;

    private String province;

    private String city;

    private String place;

    private UserVo userVo;
}
