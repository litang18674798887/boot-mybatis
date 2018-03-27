package com.pagoda.bean;

import javax.persistence.*;
import java.util.Date;

@Table(name = "store")
public class Store {
    /**
     * 门店ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 门店编号(手动录入)
     */
    @Column(name = "number")
    private String number;

    /**
     * 所属品牌ID
     */
    @Column(name = "brandID")
    private Integer brandID;

    /**
     * 所属城市ID
     */
    @Column(name = "cityID")
    private Integer cityID;

    /**
     * 门店名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 门店简称(一个城市下简称唯一)
     */
    @Column(name = "shortName")
    private String shortName;

    /**
     * 门店电话
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 门店外卖服务半径
     */
    @Column(name = "serviceRadius")
    private String serviceRadius;

    /**
     * 门店地址
     */
    @Column(name = "address")
    private String address;

    /**
     * 经度
     */
    @Column(name = "lon")
    private String lon;

    /**
     * 纬度
     */
    @Column(name = "lat")
    private String lat;

    /**
     * 门店状态，默认S A 开通 S 停用 D 删除
     */
    @Column(name = "status")
    private String status;

    /**
     * 店长姓名
     */
    @Column(name = "managerName")
    private String managerName;

    /**
     * 店长手机号
     */
    @Column(name = "managerPhone")
    private String managerPhone;

    /**
     * 是否是虚拟门店 0 虚拟 1 实体 2货柜
     */
    @Column(name = "type")
    private String type;

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
     * 及时送开始时间
     */
    @Column(name = "startTime")
    private String startTime;

    /**
     * 及时送结束时间
     */
    @Column(name = "endTime")
    private String endTime;

    /**
     * 配送方式 Y–支持门店自提  N–不支持门店自提(配送上门)
     */
    @Column(name = "isSupportTake")
    private String isSupportTake;

    /**
     * 订单小票由谁打印："APP"、"ERP"
     */

    @Column(name = "orderPrintBy")
    private String orderPrintBy;

    /**
     * 是否支持拼团: 是Y 否N
     */
    @Column(name = "groupSupport")
    private String groupSupport;

    /**
     * 图像服务半径：JSON数组
     */
    @Column(name = "serviceRadiusShape")
    private String serviceRadiusShape;

    /**
     * 门店ID
     * @return id 门店ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 门店ID
     * @param id 门店ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 门店编号(手动录入)
     * @return number 门店编号(手动录入)
     */
    public String getNumber() {
        return number;
    }

    /**
     * 门店编号(手动录入)
     * @param number 门店编号(手动录入)
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 所属品牌ID
     * @return brandID 所属品牌ID
     */
    public Integer getBrandID() {
        return brandID;
    }

    /**
     * 所属品牌ID
     * @param brandID 所属品牌ID
     */
    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    /**
     * 所属城市ID
     * @return cityID 所属城市ID
     */
    public Integer getCityID() {
        return cityID;
    }

    /**
     * 所属城市ID
     * @param cityID 所属城市ID
     */
    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    /**
     * 门店名称
     * @return name 门店名称
     */
    public String getName() {
        return name;
    }

    /**
     * 门店名称
     * @param name 门店名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 门店简称(一个城市下简称唯一)
     * @return shortName 门店简称(一个城市下简称唯一)
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * 门店简称(一个城市下简称唯一)
     * @param shortName 门店简称(一个城市下简称唯一)
     */
    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    /**
     * 门店电话
     * @return phone 门店电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 门店电话
     * @param phone 门店电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 门店外卖服务半径
     * @return serviceRadius 门店外卖服务半径
     */
    public String getServiceRadius() {
        return serviceRadius;
    }

    /**
     * 门店外卖服务半径
     * @param serviceRadius 门店外卖服务半径
     */
    public void setServiceRadius(String serviceRadius) {
        this.serviceRadius = serviceRadius == null ? null : serviceRadius.trim();
    }

    /**
     * 门店地址
     * @return address 门店地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 门店地址
     * @param address 门店地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 经度
     * @return lon 经度
     */
    public String getLon() {
        return lon;
    }

    /**
     * 经度
     * @param lon 经度
     */
    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    /**
     * 纬度
     * @return lat 纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 纬度
     * @param lat 纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 门店状态，默认S A 开通 S 停用 D 删除
     * @return status 门店状态，默认S A 开通 S 停用 D 删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 门店状态，默认S A 开通 S 停用 D 删除
     * @param status 门店状态，默认S A 开通 S 停用 D 删除
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 店长姓名
     * @return managerName 店长姓名
     */
    public String getManagerName() {
        return managerName;
    }

    /**
     * 店长姓名
     * @param managerName 店长姓名
     */
    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    /**
     * 店长手机号
     * @return managerPhone 店长手机号
     */
    public String getManagerPhone() {
        return managerPhone;
    }

    /**
     * 店长手机号
     * @param managerPhone 店长手机号
     */
    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone == null ? null : managerPhone.trim();
    }

    /**
     * 是否是虚拟门店 0 虚拟 1 实体 2货柜
     * @return type 是否是虚拟门店 0 虚拟 1 实体 2货柜
     */
    public String getType() {
        return type;
    }

    /**
     * 是否是虚拟门店 0 虚拟 1 实体 2货柜
     * @param type 是否是虚拟门店 0 虚拟 1 实体 2货柜
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * 及时送开始时间
     * @return startTime 及时送开始时间
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * 及时送开始时间
     * @param startTime 及时送开始时间
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * 及时送结束时间
     * @return endTime 及时送结束时间
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 及时送结束时间
     * @param endTime 及时送结束时间
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * 配送方式 Y–支持门店自提  N–不支持门店自提(配送上门)
     * @return isSupportTake 配送方式 Y–支持门店自提  N–不支持门店自提(配送上门)
     */
    public String getIsSupportTake() {
        return isSupportTake;
    }

    /**
     * 配送方式 Y–支持门店自提  N–不支持门店自提(配送上门)
     * @param isSupportTake 配送方式 Y–支持门店自提  N–不支持门店自提(配送上门)
     */
    public void setIsSupportTake(String isSupportTake) {
        this.isSupportTake = isSupportTake == null ? null : isSupportTake.trim();
    }

    /**
     * 订单小票由谁打印："APP"、"ERP"
     * @return orderPrintBy 订单小票由谁打印："APP"、"ERP"
     */
    public String getOrderPrintBy() {
        return orderPrintBy;
    }

    /**
     * 订单小票由谁打印："APP"、"ERP"
     * @param orderPrintBy 订单小票由谁打印："APP"、"ERP"
     */
    public void setOrderPrintBy(String orderPrintBy) {
        this.orderPrintBy = orderPrintBy == null ? null : orderPrintBy.trim();
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
     * 图像服务半径：JSON数组
     * @return serviceRadiusShape 图像服务半径：JSON数组
     */
    public String getServiceRadiusShape() {
        return serviceRadiusShape;
    }

    /**
     * 图像服务半径：JSON数组
     * @param serviceRadiusShape 图像服务半径：JSON数组
     */
    public void setServiceRadiusShape(String serviceRadiusShape) {
        this.serviceRadiusShape = serviceRadiusShape == null ? null : serviceRadiusShape.trim();
    }
}