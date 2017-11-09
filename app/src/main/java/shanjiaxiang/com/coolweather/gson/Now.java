package shanjiaxiang.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 单加响 on 2017/11/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;


    public class More{
        @SerializedName("txt")
        public String info;
    }

}
