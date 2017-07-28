package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author apple
 * @version 1.0
 */
public class City extends DataSupport {

    public static City create(String cityName, int cityCode, int provinceId) {
        City city = new City();
        city.setCityName(cityName);
        city.setCityCode(cityCode);
        city.setProvinceId(provinceId);
        return city;
    }

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

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
