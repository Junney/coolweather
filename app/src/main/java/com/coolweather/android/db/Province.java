package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * @author apple
 * @version 1.0
 */
public class Province extends DataSupport {

    public static Province create(String provinceName, int provinceCode) {
        Province province = new Province();
        province.setProvinceName(provinceName);
        province.setProvinceCode(provinceCode);
        return province;
    }

    private int id;
    private String provinceName;
    private int provinceCode;

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
