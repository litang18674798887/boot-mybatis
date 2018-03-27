package com.pagoda.bean;

import javax.persistence.*;
import java.util.Date;

@Table(name = "store_goods_rel")
public class StoreGoodsRel {
    /**
     * 自增ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 门店ID
     */
    @Column(name = "storeID")
    private Integer storeID;

    /**
     * 商品ID
     */
    @Column(name = "goodsID")
    private Integer goodsID;

    /**
     * 关系状态(A 可用 S 不可用)，默认S
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
     * 门店销售该商品的状态【马上送+次日达拆分】N 马上送 C 次日达
     */
    @Column(name = "saleStatus")
    private String saleStatus;

    /**
     * 门店商品边界值
     */
    @Column(name = "stockBorder")
    private Integer stockBorder;

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
     * 门店ID
     * @return storeID 门店ID
     */
    public Integer getStoreID() {
        return storeID;
    }

    /**
     * 门店ID
     * @param storeID 门店ID
     */
    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
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
     * 关系状态(A 可用 S 不可用)，默认S
     * @return status 关系状态(A 可用 S 不可用)，默认S
     */
    public String getStatus() {
        return status;
    }

    /**
     * 关系状态(A 可用 S 不可用)，默认S
     * @param status 关系状态(A 可用 S 不可用)，默认S
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
     * 门店销售该商品的状态【马上送+次日达拆分】N 马上送 C 次日达
     * @return saleStatus 门店销售该商品的状态【马上送+次日达拆分】N 马上送 C 次日达
     */
    public String getSaleStatus() {
        return saleStatus;
    }

    /**
     * 门店销售该商品的状态【马上送+次日达拆分】N 马上送 C 次日达
     * @param saleStatus 门店销售该商品的状态【马上送+次日达拆分】N 马上送 C 次日达
     */
    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus == null ? null : saleStatus.trim();
    }

    /**
     * 门店商品边界值
     * @return stockBorder 门店商品边界值
     */
    public Integer getStockBorder() {
        return stockBorder;
    }

    /**
     * 门店商品边界值
     * @param stockBorder 门店商品边界值
     */
    public void setStockBorder(Integer stockBorder) {
        this.stockBorder = stockBorder;
    }
}