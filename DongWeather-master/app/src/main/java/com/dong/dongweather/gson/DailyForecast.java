package com.dong.dongweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/4/18.
 */

public class DailyForecast {
    @SerializedName("cond")
    public Cond cond;

    public class Cond{
        @SerializedName("txt_d")
        public String dayWeather;
        @SerializedName("txt_n")
        public String nightWeather;
        public String code_d;
        public String code_n;
    }


    public String date;

    @SerializedName("tmp")
    public Tmp tmp;
    public class Tmp{
        public String max;
        public String min;
    }

}
