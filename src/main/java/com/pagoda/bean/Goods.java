package com.pagoda.bean;

import javax.persistence.*;
import java.util.Date;

@Table(name = "goods")
public class Goods {
    /**
     * 商品ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 商品的外卖属性
是否为预售商品(P 预售  N 非预售)
     */
    @Column(name = "isPre")
    private String isPre;

    /**
     * 预定建议
     */
    @Column(name = "preAdvice")
    private String preAdvice;

    /**
     * 归属品牌
     */
    @Column(name = "brandID")
    private Integer brandID;

    /**
     * 商品原价
     */
    @Column(name = "price")
    private String price;

    /**
     * 商品交易价
     */
    @Column(name = "bidPrice")
    private String bidPrice;

    /**
     * 商品编号
     */
    @Column(name = "number")
    private String number;

    /**
     * 商品规格
     */
    @Column(name = "spec")
    private String spec;

    /**
     * 商品头图
     */
    @Column(name = "headPic")
    private String headPic;

    /**
     * 商品状态 Y 完成 N 未完成，默认N
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
     * 商品的外卖属性子类型 当isPre = P  goodSubType为空
当isPre = N goodSubType = C 次日达
     */
    @Column(name = "goodSubType")
    private String goodSubType;

    /**
     * 商品副标题
     */
    @Column(name = "subTitle")
    private String subTitle;

    /**
     * 商品产地
     */
    @Column(name = "productionPlace")
    private String productionPlace;

    /**
     * 商品级别 内置招牌 A级 B级 C级
     */
    @Column(name = "level")
    private String level;

    /**
     * 储存方式
     */
    @Column(name = "storeWay")
    private String storeWay;

    /**
     * 营养价值
     */
    @Column(name = "nutritionValue")
    private String nutritionValue;

    /**
     * 温馨提示
     */
    @Column(name = "warmTip")
    private String warmTip;

    /**
     * 配送属性  1—自提商品  2---非自提商品 
     */
    @Column(name = "deliveryType")
    private String deliveryType;

    /**
     * 
     */
    @Column(name = "pickingTip")
    private String pickingTip;

    /**
     * 门店类型属性：S 门店订单  B 货柜订单
     */
    @Column(name = "ownedStoreType")
    private String ownedStoreType;

    /**
     * FINISH:已完成发布； OPEN:待发布； CLOSE:发布关闭
     */
    @Column(name = "publishStatus")
    private String publishStatus;

    /**
     * 商品发布时间
     */
    @Column(name = "publishTime")
    private String publishTime;

    /**
     * 团商品头图
     */
    @Column(name = "groupHeadPic")
    private String groupHeadPic;

    /**
     * 是否支持拼团: 是Y 否N
     */
    @Column(name = "groupSupport")
    private String groupSupport;

    /**
     * 团价格
     */
    @Column(name = "groupPrice")
    private Integer groupPrice;

    /**
     * 团人数
     */
    @Column(name = "groupSize")
    private Integer groupSize;

    /**
     * 团时间(拼团时限 单位s)
     */
    @Column(name = "limitTime")
    private Integer limitTime;

    /**
     * 团活动开始时间
     */
    @Column(name = "groupStartTime")
    private Date groupStartTime;

    /**
     * 团活动结束时间
     */
    @Column(name = "groupEndTime")
    private Date groupEndTime;

    /**
     * 拼团商品分享图片URL
     */
    @Column(name = "groupSharePic")
    private String groupSharePic;

    /**
     * 拼团商品分享标题
     */
    @Column(name = "groupShareTitle")
    private String groupShareTitle;

    /**
     * 商品ID
     * @return id 商品ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 商品ID
     * @param id 商品ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商品名称
     * @return name 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 商品名称
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 商品的外卖属性
是否为预售商品(P 预售  N 非预售)
     * @return isPre 商品的外卖属性
是否为预售商品(P 预售  N 非预售)
     */
    public String getIsPre() {
        return isPre;
    }

    /**
     * 商品的外卖属性
是否为预售商品(P 预售  N 非预售)
     * @param isPre 商品的外卖属性
是否为预售商品(P 预售  N 非预售)
     */
    public void setIsPre(String isPre) {
        this.isPre = isPre == null ? null : isPre.trim();
    }

    /**
     * 预定建议
     * @return preAdvice 预定建议
     */
    public String getPreAdvice() {
        return preAdvice;
    }

    /**
     * 预定建议
     * @param preAdvice 预定建议
     */
    public void setPreAdvice(String preAdvice) {
        this.preAdvice = preAdvice == null ? null : preAdvice.trim();
    }

    /**
     * 归属品牌
     * @return brandID 归属品牌
     */
    public Integer getBrandID() {
        return brandID;
    }

    /**
     * 归属品牌
     * @param brandID 归属品牌
     */
    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    /**
     * 商品原价
     * @return price 商品原价
     */
    public String getPrice() {
        return price;
    }

    /**
     * 商品原价
     * @param price 商品原价
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * 商品交易价
     * @return bidPrice 商品交易价
     */
    public String getBidPrice() {
        return bidPrice;
    }

    /**
     * 商品交易价
     * @param bidPrice 商品交易价
     */
    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice == null ? null : bidPrice.trim();
    }

    /**
     * 商品编号
     * @return number 商品编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 商品编号
     * @param number 商品编号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 商品规格
     * @return spec 商品规格
     */
    public String getSpec() {
        return spec;
    }

    /**
     * 商品规格
     * @param spec 商品规格
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * 商品头图
     * @return headPic 商品头图
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * 商品头图
     * @param headPic 商品头图
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic == null ? null : headPic.trim();
    }

    /**
     * 商品状态 Y 完成 N 未完成，默认N
     * @return status 商品状态 Y 完成 N 未完成，默认N
     */
    public String getStatus() {
        return status;
    }

    /**
     * 商品状态 Y 完成 N 未完成，默认N
     * @param status 商品状态 Y 完成 N 未完成，默认N
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
     * 商品的外卖属性子类型 当isPre = P  goodSubType为空
当isPre = N goodSubType = C 次日达
     * @return goodSubType 商品的外卖属性子类型 当isPre = P  goodSubType为空
当isPre = N goodSubType = C 次日达
     */
    public String getGoodSubType() {
        return goodSubType;
    }

    /**
     * 商品的外卖属性子类型 当isPre = P  goodSubType为空
当isPre = N goodSubType = C 次日达
     * @param goodSubType 商品的外卖属性子类型 当isPre = P  goodSubType为空
当isPre = N goodSubType = C 次日达
     */
    public void setGoodSubType(String goodSubType) {
        this.goodSubType = goodSubType == null ? null : goodSubType.trim();
    }

    /**
     * 商品副标题
     * @return subTitle 商品副标题
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * 商品副标题
     * @param subTitle 商品副标题
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * 商品产地
     * @return productionPlace 商品产地
     */
    public String getProductionPlace() {
        return productionPlace;
    }

    /**
     * 商品产地
     * @param productionPlace 商品产地
     */
    public void setProductionPlace(String productionPlace) {
        this.productionPlace = productionPlace == null ? null : productionPlace.trim();
    }

    /**
     * 商品级别 内置招牌 A级 B级 C级
     * @return level 商品级别 内置招牌 A级 B级 C级
     */
    public String getLevel() {
        return level;
    }

    /**
     * 商品级别 内置招牌 A级 B级 C级
     * @param level 商品级别 内置招牌 A级 B级 C级
     */
    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * 储存方式
     * @return storeWay 储存方式
     */
    public String getStoreWay() {
        return storeWay;
    }

    /**
     * 储存方式
     * @param storeWay 储存方式
     */
    public void setStoreWay(String storeWay) {
        this.storeWay = storeWay == null ? null : storeWay.trim();
    }

    /**
     * 营养价值
     * @return nutritionValue 营养价值
     */
    public String getNutritionValue() {
        return nutritionValue;
    }

    /**
     * 营养价值
     * @param nutritionValue 营养价值
     */
    public void setNutritionValue(String nutritionValue) {
        this.nutritionValue = nutritionValue == null ? null : nutritionValue.trim();
    }

    /**
     * 温馨提示
     * @return warmTip 温馨提示
     */
    public String getWarmTip() {
        return warmTip;
    }

    /**
     * 温馨提示
     * @param warmTip 温馨提示
     */
    public void setWarmTip(String warmTip) {
        this.warmTip = warmTip == null ? null : warmTip.trim();
    }

    /**
     * 配送属性  1—自提商品  2---非自提商品 
     * @return deliveryType 配送属性  1—自提商品  2---非自提商品 
     */
    public String getDeliveryType() {
        return deliveryType;
    }

    /**
     * 配送属性  1—自提商品  2---非自提商品 
     * @param deliveryType 配送属性  1—自提商品  2---非自提商品 
     */
    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType == null ? null : deliveryType.trim();
    }

    /**
     * 
     * @return pickingTip 
     */
    public String getPickingTip() {
        return pickingTip;
    }

    /**
     * 
     * @param pickingTip 
     */
    public void setPickingTip(String pickingTip) {
        this.pickingTip = pickingTip == null ? null : pickingTip.trim();
    }

    /**
     * 门店类型属性：S 门店订单  B 货柜订单
     * @return ownedStoreType 门店类型属性：S 门店订单  B 货柜订单
     */
    public String getOwnedStoreType() {
        return ownedStoreType;
    }

    /**
     * 门店类型属性：S 门店订单  B 货柜订单
     * @param ownedStoreType 门店类型属性：S 门店订单  B 货柜订单
     */
    public void setOwnedStoreType(String ownedStoreType) {
        this.ownedStoreType = ownedStoreType == null ? null : ownedStoreType.trim();
    }

    /**
     * FINISH:已完成发布； OPEN:待发布； CLOSE:发布关闭
     * @return publishStatus FINISH:已完成发布； OPEN:待发布； CLOSE:发布关闭
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * FINISH:已完成发布； OPEN:待发布； CLOSE:发布关闭
     * @param publishStatus FINISH:已完成发布； OPEN:待发布； CLOSE:发布关闭
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus == null ? null : publishStatus.trim();
    }

    /**
     * 商品发布时间
     * @return publishTime 商品发布时间
     */
    public String getPublishTime() {
        return publishTime;
    }

    /**
     * 商品发布时间
     * @param publishTime 商品发布时间
     */
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime == null ? null : publishTime.trim();
    }

    /**
     * 团商品头图
     * @return groupHeadPic 团商品头图
     */
    public String getGroupHeadPic() {
        return groupHeadPic;
    }

    /**
     * 团商品头图
     * @param groupHeadPic 团商品头图
     */
    public void setGroupHeadPic(String groupHeadPic) {
        this.groupHeadPic = groupHeadPic == null ? null : groupHeadPic.trim();
    }

    /**
     * 是否支持拼团: 是Y 否N
     * @return groupSupport 是否支持拼团: 是Y 否N
     */
    public String getGroupSupport() {
        return groupSupport;
    }

    /**
     * 是否支持拼团: 是Y 否N
     * @param groupSupport 是否支持拼团: 是Y 否N
     */
    public void setGroupSupport(String groupSupport) {
        this.groupSupport = groupSupport == null ? null : groupSupport.trim();
    }

    /**
     * 团价格
     * @return groupPrice 团价格
     */
    public Integer getGroupPrice() {
        return groupPrice;
    }

    /**
     * 团价格
     * @param groupPrice 团价格
     */
    public void setGroupPrice(Integer groupPrice) {
        this.groupPrice = groupPrice;
    }

    /**
     * 团人数
     * @return groupSize 团人数
     */
    public Integer getGroupSize() {
        return groupSize;
    }

    /**
     * 团人数
     * @param groupSize 团人数
     */
    public void setGroupSize(Integer groupSize) {
        this.groupSize = groupSize;
    }

    /**
     * 团时间(拼团时限 单位s)
     * @return limitTime 团时间(拼团时限 单位s)
     */
    public Integer getLimitTime() {
        return limitTime;
    }

    /**
     * 团时间(拼团时限 单位s)
     * @param limitTime 团时间(拼团时限 单位s)
     */
    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    /**
     * 团活动开始时间
     * @return groupStartTime 团活动开始时间
     */
    public Date getGroupStartTime() {
        return groupStartTime;
    }

    /**
     * 团活动开始时间
     * @param groupStartTime 团活动开始时间
     */
    public void setGroupStartTime(Date groupStartTime) {
        this.groupStartTime = groupStartTime;
    }

    /**
     * 团活动结束时间
     * @return groupEndTime 团活动结束时间
     */
    public Date getGroupEndTime() {
        return groupEndTime;
    }

    /**
     * 团活动结束时间
     * @param groupEndTime 团活动结束时间
     */
    public void setGroupEndTime(Date groupEndTime) {
        this.groupEndTime = groupEndTime;
    }

    /**
     * 拼团商品分享图片URL
     * @return groupSharePic 拼团商品分享图片URL
     */
    public String getGroupSharePic() {
        return groupSharePic;
    }

    /**
     * 拼团商品分享图片URL
     * @param groupSharePic 拼团商品分享图片URL
     */
    public void setGroupSharePic(String groupSharePic) {
        this.groupSharePic = groupSharePic == null ? null : groupSharePic.trim();
    }

    /**
     * 拼团商品分享标题
     * @return groupShareTitle 拼团商品分享标题
     */
    public String getGroupShareTitle() {
        return groupShareTitle;
    }

    /**
     * 拼团商品分享标题
     * @param groupShareTitle 拼团商品分享标题
     */
    public void setGroupShareTitle(String groupShareTitle) {
        this.groupShareTitle = groupShareTitle == null ? null : groupShareTitle.trim();
    }
}