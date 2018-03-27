package com.pagoda.out;

/**
 * 描述：此bean记录了所有的商品信息
 *
 * @author : litang
 * @date : Create in 2018/3/26
 */
public class GoodsUpdate {

    /**
     * 商品id
     */
    private Integer goodsId;

    /**
     * 城市id
     */
    private Integer cityId;

    /**
     * 门店id
     */
    private Integer storeId;

    /**
     * 门店商品状态
     */
    private String storeStauts;

    /**
     * 城市商品上架状态
     */
    private String cityStauts;


    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getStoreStauts() {
        return storeStauts;
    }

    public void setStoreStauts(String storeStauts) {
        this.storeStauts = storeStauts;
    }

    public String getCityStauts() {
        return cityStauts;
    }

    public void setCityStauts(String cityStauts) {
        this.cityStauts = cityStauts;
    }
}
