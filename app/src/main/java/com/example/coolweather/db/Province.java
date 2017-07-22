package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Aloha on 2017/7/22.
 */

public class Province extends DataSupport {
    private int id; //每个实体类都有的字段
    private String provinceName; //省份名称
    private int provinceCode; //省份代码

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
