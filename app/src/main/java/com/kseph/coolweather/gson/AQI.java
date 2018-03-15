package com.kseph.coolweather.gson;

/**
 * Created by kseph on 2018/3/15.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
