package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Aloha on 2017/7/22.
 */

public class City extends DataSupport {
    private int id; //每个实体类都有的字段
    private String cityName; //城市名称
    private int cityCode; //城市代码
    private int provinceId; //城市所在省份代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
