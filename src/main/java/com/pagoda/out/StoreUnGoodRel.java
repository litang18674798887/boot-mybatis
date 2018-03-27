package com.pagoda.out;

import com.pagoda.bean.GoodsCityRel;

import java.util.List;

/**
 * @author : litang
 * @date : Create in 2018/3/27
 */
public class StoreUnGoodRel {

    /**
     * 门店id
     */
    private Integer storeId;


    /**
     * 门店名称
     */
    private String name;

    /**
     * 门店未上架的商品
     */
    private List<GoodsCityRel> goodsCityRelList;

    private String goodsLenth;

    public String getGoodsLenth() {
        return goodsLenth;
    }

    public void setGoodsLenth(String goodsLenth) {
        this.goodsLenth = goodsLenth;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public List<GoodsCityRel> getGoodsCityRelList() {
        return goodsCityRelList;
    }

    public void setGoodsCityRelList(List<GoodsCityRel> goodsCityRelList) {
        this.goodsCityRelList = goodsCityRelList;
        setGoodsLenth("当前门店未上架的商品有==》"+goodsCityRelList.size() +"个");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
