package com.will.gitweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 和风GSON数据结构
 */

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
