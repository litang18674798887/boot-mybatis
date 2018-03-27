package com.pagoda.bean.condition;

/**
 * @author : litang
 * @date : Create in 2018/3/27
 */
public class GoodsCityCodition {

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
     * 商品id
     */
    private Integer cityId;

    /**
     * 商品城市状态
     */
    private String goodsCityRelStatus;

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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getGoodsCityRelStatus() {
        return goodsCityRelStatus;
    }

    public void setGoodsCityRelStatus(String goodsCityRelStatus) {
        this.goodsCityRelStatus = goodsCityRelStatus;
    }
}
