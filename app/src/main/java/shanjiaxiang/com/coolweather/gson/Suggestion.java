package shanjiaxiang.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import shanjiaxiang.com.coolweather.db.County;

/**
 * Created by 单加响 on 2017/11/6.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;


    public Sport sport;



    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }

}
