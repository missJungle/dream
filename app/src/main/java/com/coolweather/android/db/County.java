package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/4/13 0013.
 */

public class County extends DataSupport {
    private int id;
    private  String countyName;
    private  int weatherId;
    private int cityId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getCountyName(){
        return countyName;
    }
    public void setCountyName(String cityName){
        this.countyName = cityName;
    }
    public int getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(){
        this.weatherId = weatherId;
    }
    public int getCityId(){
        return cityId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
