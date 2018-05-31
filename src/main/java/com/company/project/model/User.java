package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "open_id")
    private String openId;

    /**
     * 用户名（自己取的）
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 微信昵称
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 性别  1：男
     */
    private Integer gender;

    @Column(name = "avatar_url")
    private String avatarUrl;

    /**
     * 添加时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 国籍
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市（微信信息）
     */
    private String city;

    /**
     * 获取用户表
     *
     * @return id - 用户表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户表
     *
     * @param id 用户表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * @param openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取用户名（自己取的）
     *
     * @return user_name - 用户名（自己取的）
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名（自己取的）
     *
     * @param userName 用户名（自己取的）
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取微信昵称
     *
     * @return nick_name - 微信昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置微信昵称
     *
     * @param nickName 微信昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取性别  1：男
     *
     * @return gender - 性别  1：男
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别  1：男
     *
     * @param gender 性别  1：男
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * @return avatar_url
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * @param avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取国籍
     *
     * @return country - 国籍
     */
    public String getCountry() {
        return country;
    }

    /**
     * 设置国籍
     *
     * @param country 国籍
     */
    public void setCountry(String country) {
        this.country = country;
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
     * 获取城市（微信信息）
     *
     * @return city - 城市（微信信息）
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置城市（微信信息）
     *
     * @param city 城市（微信信息）
     */
    public void setCity(String city) {
        this.city = city;
    }
}