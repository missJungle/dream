package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/4/13 0013.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
                  //okhttp3.Callback参数，这个是OkHttp库中自带的一个回调接口
        OkHttpClient client = new OkHttpClient();
        Request resquest = new Request.Builder().url(address).build();
        client.newCall(resquest).enqueue(callback);
    }
}
