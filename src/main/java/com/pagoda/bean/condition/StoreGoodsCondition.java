package com.pagoda.bean.condition;

/**
 * @author : litang
 * @date : Create in 2018/3/27
 */
public class StoreGoodsCondition {

    /**
     * 商品状态
     */
    private String goodsStatus;

    /**
     * 是否预售属性
     */
    private String isPre;

    /**
     * 外卖属性子类型
     */
    private String goodSubType;

    /**
     * 拼团属性
     */
    private String groupSupport;

    /**
     * 门店id
     */
    private Integer storeID;

    /**
     * 门店状态
     */
    private String storeStatus;

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public String getIsPre() {
        return isPre;
    }

    public void setIsPre(String isPre) {
        this.isPre = isPre;
    }

    public String getGoodSubType() {
        return goodSubType;
    }

    public void setGoodSubType(String goodSubType) {
        this.goodSubType = goodSubType;
    }

    public String getGroupSupport() {
        return groupSupport;
    }

    public void setGroupSupport(String groupSupport) {
        this.groupSupport = groupSupport;
    }

    public Integer getStoreID() {
        return storeID;
    }

    public void setStoreID(Integer storeID) {
        this.storeID = storeID;
    }

    public String getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(String storeStatus) {
        this.storeStatus = storeStatus;
    }
}
