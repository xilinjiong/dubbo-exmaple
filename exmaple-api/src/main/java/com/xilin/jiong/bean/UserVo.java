package com.xilin.jiong.bean;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户相关数据〉
 *
 * @author Administrator
 * @create 2019/1/21
 * @since 1.0.0
 */

@Data
public class UserVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 地址
     */
    private String address;

    /**
     * 工作
     */
    private String job;

    /**
     * 0:无效,1:有效
     */
    private Byte state;

    private static final long serialVersionUID = 1L;
}
