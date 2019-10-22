package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Shinelon on 2019/10/23.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private int cityId;
    private String weatherId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {

        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }
}
