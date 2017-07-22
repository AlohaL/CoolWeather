package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Aloha on 2017/7/22.
 */

public class Country extends DataSupport {
    private int id; //每个实体类都有的字段
    private String countyName; //县名
    private String weatherId; //县所对应的天气的ID
    private int cityId; //县所在城市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
