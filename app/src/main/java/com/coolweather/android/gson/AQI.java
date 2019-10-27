package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Shinelon on 2019/10/26.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
