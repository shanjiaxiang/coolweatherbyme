package shanjiaxiang.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 单加响 on 2017/11/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;

    }
}
