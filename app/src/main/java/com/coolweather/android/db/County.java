package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author apple
 * @version 1.0
 */
public class County extends DataSupport {

    public static County create(String countyName, String weatherId, int cityId) {
        County county = new County();
        county.setCountyName(countyName);
        county.setWeatherId(weatherId);
        county.setCityId(cityId);
        return county;
    }

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

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
