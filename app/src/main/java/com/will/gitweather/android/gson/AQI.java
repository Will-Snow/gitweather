package com.will.gitweather.android.gson;

/**
 * 和风接口返回的 JSON数据类型
 */

public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}
