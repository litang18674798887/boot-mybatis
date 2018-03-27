package com.pagoda.bean;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Litang
 */
@Table(name = "city")
public class City {
    /**
     * 城市id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 城市名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 城市经度
     */
    @Column(name = "lon")
    private String lon;

    /**
     * 城市纬度
     */
    @Column(name = "lat")
    private String lat;

    /**
     * 城市在地图中的ID
     */
    @Column(name = "mapCityID")
    private String mapCityID;

    /**
     * 城市所属省份
     */
    @Column(name = "province")
    private String province;

    /**
     * 城市状态: A 开通  S停用  ，默认开通
     */
    @Column(name = "status")
    private String status;

    /**
     * 是否是默认城市(默认为否) Y 是 N 否
     */
    @Column(name = "isDefault")
    private String isDefault;

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
     * 城市id
     * @return id 城市id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 城市id
     * @param id 城市id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 城市名称
     * @return name 城市名称
     */
    public String getName() {
        return name;
    }

    /**
     * 城市名称
     * @param name 城市名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 城市经度
     * @return lon 城市经度
     */
    public String getLon() {
        return lon;
    }

    /**
     * 城市经度
     * @param lon 城市经度
     */
    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    /**
     * 城市纬度
     * @return lat 城市纬度
     */
    public String getLat() {
        return lat;
    }

    /**
     * 城市纬度
     * @param lat 城市纬度
     */
    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    /**
     * 城市在地图中的ID
     * @return mapCityID 城市在地图中的ID
     */
    public String getMapCityID() {
        return mapCityID;
    }

    /**
     * 城市在地图中的ID
     * @param mapCityID 城市在地图中的ID
     */
    public void setMapCityID(String mapCityID) {
        this.mapCityID = mapCityID == null ? null : mapCityID.trim();
    }

    /**
     * 城市所属省份
     * @return province 城市所属省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 城市所属省份
     * @param province 城市所属省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 城市状态: A 开通  S停用  ，默认开通
     * @return status 城市状态: A 开通  S停用  ，默认开通
     */
    public String getStatus() {
        return status;
    }

    /**
     * 城市状态: A 开通  S停用  ，默认开通
     * @param status 城市状态: A 开通  S停用  ，默认开通
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 是否是默认城市(默认为否) Y 是 N 否
     * @return isDefault 是否是默认城市(默认为否) Y 是 N 否
     */
    public String getIsDefault() {
        return isDefault;
    }

    /**
     * 是否是默认城市(默认为否) Y 是 N 否
     * @param isDefault 是否是默认城市(默认为否) Y 是 N 否
     */
    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
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
}