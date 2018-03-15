package com.kseph.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kseph on 2018/3/15.
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
