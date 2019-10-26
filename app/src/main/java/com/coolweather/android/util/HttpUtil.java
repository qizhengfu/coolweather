package com.coolweather.android.util;

import android.app.DownloadManager;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Shinelon on 2019/10/24.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String addr,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(addr).build();
        client.newCall(request).enqueue(callback);
    }
}
