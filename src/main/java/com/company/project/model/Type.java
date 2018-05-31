package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 大分类：收支；支出：0   收入：1
     */
    @Column(name = "big_type")
    private Integer bigType;

    /**
     * 中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它
     */
    @Column(name = "mid_type")
    private Integer midType;

    /**
     * mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费
     */
    @Column(name = "small_type")
    private Integer smallType;

    /**
     * 单次消费金额
     */
    private Float money;

    /**
     * 消费标题
     */
    private String title;

    /**
     * 消费说明、注释
     */
    private String desc;

    /**
     * 交易时间，即记录账目发生日期
     */
    @Column(name = "transaction_date")
    private Date transactionDate;

    /**
     * 添加本条记录时间
     */
    @Column(name = "add_time")
    private Date addTime;

    /**
     * 修改本次交易记录时间
     */
    @Column(name = "edit_time")
    private Date editTime;

    /**
     * 是否删除(软删除)，0：未删除   1：删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取大分类：收支；支出：0   收入：1
     *
     * @return big_type - 大分类：收支；支出：0   收入：1
     */
    public Integer getBigType() {
        return bigType;
    }

    /**
     * 设置大分类：收支；支出：0   收入：1
     *
     * @param bigType 大分类：收支；支出：0   收入：1
     */
    public void setBigType(Integer bigType) {
        this.bigType = bigType;
    }

    /**
     * 获取中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它
     *
     * @return mid_type - 中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它
     */
    public Integer getMidType() {
        return midType;
    }

    /**
     * 设置中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它
     *
     * @param midType 中级分类；0：消费  1：理财  2：保险  3：借还款  4：人情往来  5：公益  6：小买卖  7：酬劳  8：奖金  9：其它
     */
    public void setMidType(Integer midType) {
        this.midType = midType;
    }

    /**
     * 获取mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费
     *
     * @return small_type - mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费
     */
    public Integer getSmallType() {
        return smallType;
    }

    /**
     * 设置mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费
     *
     * @param smallType mid_type为0时才不为空，即消费类别子分类；0:全部 1：饮食 2：服饰美容 3：生活日用 4：住房缴费 5：交通出行  6：通讯  7：文教娱乐  8：健康  9：其它消费
     */
    public void setSmallType(Integer smallType) {
        this.smallType = smallType;
    }

    /**
     * 获取单次消费金额
     *
     * @return money - 单次消费金额
     */
    public Float getMoney() {
        return money;
    }

    /**
     * 设置单次消费金额
     *
     * @param money 单次消费金额
     */
    public void setMoney(Float money) {
        this.money = money;
    }

    /**
     * 获取消费标题
     *
     * @return title - 消费标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置消费标题
     *
     * @param title 消费标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取消费说明、注释
     *
     * @return desc - 消费说明、注释
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置消费说明、注释
     *
     * @param desc 消费说明、注释
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取交易时间，即记录账目发生日期
     *
     * @return transaction_date - 交易时间，即记录账目发生日期
     */
    public Date getTransactionDate() {
        return transactionDate;
    }

    /**
     * 设置交易时间，即记录账目发生日期
     *
     * @param transactionDate 交易时间，即记录账目发生日期
     */
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * 获取添加本条记录时间
     *
     * @return add_time - 添加本条记录时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加本条记录时间
     *
     * @param addTime 添加本条记录时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取修改本次交易记录时间
     *
     * @return edit_time - 修改本次交易记录时间
     */
    public Date getEditTime() {
        return editTime;
    }

    /**
     * 设置修改本次交易记录时间
     *
     * @param editTime 修改本次交易记录时间
     */
    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    /**
     * 获取是否删除(软删除)，0：未删除   1：删除
     *
     * @return is_delete - 是否删除(软删除)，0：未删除   1：删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(软删除)，0：未删除   1：删除
     *
     * @param isDelete 是否删除(软删除)，0：未删除   1：删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}