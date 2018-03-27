package com.pagoda.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Table(name = "goods_city_rel")
public class GoodsCityRel {
    /**
     * 自增ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品ID
     */
    @Column(name = "goodsID")
    private Integer goodsID;

    /**
     * 城市ID
     */
    @Column(name = "cityID")
    private Integer cityID;

    /**
     * 上架状态
(A  上架 ， S 下架 ，D 灰度上架  )
默认S
     */
    @Column(name = "status")
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "createTime")
    private Date createTime;

    /**
     * 最后更新时间
     */
    @Column(name = "lastUpdate")
    private Date lastUpdate;

    /**
     * 下架状态。A:暂不上架
     */
    @Column(name = "downStatus")
    private String downStatus;

    /**
     * 当前生效限购数量N代表无穷大
     */
    @Column(name = "effectNum")
    private String effectNum;

    /**
     * 等待发布限购数量
     */
    @Column(name = "waitNum")
    private String waitNum;

    /**
     * 自增ID
     * @return id 自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 自增ID
     * @param id 自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品ID
     * @return goodsID 商品ID
     */
    public Integer getGoodsID() {
        return goodsID;
    }

    /**
     * 商品ID
     * @param goodsID 商品ID
     */
    public void setGoodsID(Integer goodsID) {
        this.goodsID = goodsID;
    }

    /**
     * 城市ID
     * @return cityID 城市ID
     */
    public Integer getCityID() {
        return cityID;
    }

    /**
     * 城市ID
     * @param cityID 城市ID
     */
    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    /**
     * 上架状态
(A  上架 ， S 下架 ，D 灰度上架  )
默认S
     * @return status 上架状态
(A  上架 ， S 下架 ，D 灰度上架  )
默认S
     */
    public String getStatus() {
        return status;
    }

    /**
     * 上架状态
(A  上架 ， S 下架 ，D 灰度上架  )
默认S
     * @param status 上架状态
(A  上架 ， S 下架 ，D 灰度上架  )
默认S
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 创建时间
     * @return createTime 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后更新时间
     * @return lastUpdate 最后更新时间
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * 最后更新时间
     * @param lastUpdate 最后更新时间
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * 下架状态。A:暂不上架
     * @return downStatus 下架状态。A:暂不上架
     */
    public String getDownStatus() {
        return downStatus;
    }

    /**
     * 下架状态。A:暂不上架
     * @param downStatus 下架状态。A:暂不上架
     */
    public void setDownStatus(String downStatus) {
        this.downStatus = downStatus == null ? null : downStatus.trim();
    }

    /**
     * 当前生效限购数量N代表无穷大
     * @return effectNum 当前生效限购数量N代表无穷大
     */
    public String getEffectNum() {
        return effectNum;
    }

    /**
     * 当前生效限购数量N代表无穷大
     * @param effectNum 当前生效限购数量N代表无穷大
     */
    public void setEffectNum(String effectNum) {
        this.effectNum = effectNum == null ? null : effectNum.trim();
    }

    /**
     * 等待发布限购数量
     * @return waitNum 等待发布限购数量
     */
    public String getWaitNum() {
        return waitNum;
    }

    /**
     * 等待发布限购数量
     * @param waitNum 等待发布限购数量
     */
    public void setWaitNum(String waitNum) {
        this.waitNum = waitNum == null ? null : waitNum.trim();
    }
}