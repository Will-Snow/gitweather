package com.will.gitweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 和风接口返回的 JSON数据类型
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
