package com.guard.tool;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;

import java.io.IOException;

public class Get_result {

    public String getResult(String path) throws IOException {
//        String path = "https://i.loli.net/2021/07/29/badDNR2OCironUf.jpg";
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, "path=" + path);
        Request request = new Request.Builder()
                .url("http://8.129.164.238:8000/predict")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
//        System.out.println(result);

        Gson gson = new Gson();
        java.lang.reflect.Type type = new TypeToken<Rice_result>() {
        }.getType();
        Rice_result rice_result = gson.fromJson(result, type);
        System.out.println(rice_result);
        if ("200".equals(rice_result.getMsg())) {
//            System.out.println(rice_result.getResult());
            return Rice_result.convertdata(rice_result.getResult());
        } else {
//            System.out.println("获取结果出错！！");
            return "获取结果出错！！";
        }

    }
}
