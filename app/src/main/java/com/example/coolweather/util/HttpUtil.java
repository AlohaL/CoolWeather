package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Aloha on 2017/7/22.
 */

public class HttpUtil {
    /**
     * 发起Http请求时只需调用sendOkHttpRequest()方法，传入请求地址，并
     * 注册一个毁掉来处理服务器响应就可以了。
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
