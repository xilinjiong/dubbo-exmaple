package com.xilin.jiong.bean;

import java.io.Serializable;
import java.util.Arrays;
import javax.persistence.*;

@Table(name = "t_address")
public class Address implements Serializable {
    /**
     * 主键
     */
    @Id
    private Long id;

    /**
     * 省份
     */
    private String province;

    /**
     * 市区
     */
    private String city;

    /**
     * 详细地址
     */
    private String place;

    /**
     * 1:有效,0:删除
     */
    private Byte state;

    /**
     * 用户id
     */
    private byte[] uid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取省份
     *
     * @return province - 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 设置省份
     *
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取市区
     *
     * @return city - 市区
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置市区
     *
     * @param city 市区
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取详细地址
     *
     * @return place - 详细地址
     */
    public String getPlace() {
        return place;
    }

    /**
     * 设置详细地址
     *
     * @param place 详细地址
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * 获取1:有效,0:删除
     *
     * @return state - 1:有效,0:删除
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置1:有效,0:删除
     *
     * @param state 1:有效,0:删除
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public byte[] getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(byte[] uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", place=").append(place);
        sb.append(", state=").append(state);
        sb.append(", uid=").append(uid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Address other = (Address) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (Arrays.equals(this.getUid(), other.getUid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + (Arrays.hashCode(getUid()));
        return result;
    }
}