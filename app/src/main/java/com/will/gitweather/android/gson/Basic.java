package com.will.gitweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 和风接口返回的 JSON数据类型
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }

}
