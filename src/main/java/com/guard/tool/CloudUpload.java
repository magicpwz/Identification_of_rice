package com.guard.tool;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;

import java.io.File;
import java.io.IOException;


public class CloudUpload {

    //  public static void main(String []args) throws IOException{
//
//    String file_path = "E:/machine_learning/test8.jpg";
//    OkHttpClient client = new OkHttpClient().newBuilder()
//      .build();
//    MediaType mediaType = MediaType.parse("multipart/form-data");
//    RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
//      .addFormDataPart("smfile",file_path,
//        RequestBody.create(MediaType.parse("application/octet-stream"),
//        new File(file_path)))
//      .addFormDataPart("format","json")
//      .build();
//    Request request = new Request.Builder()
//      .url("https://sm.ms/api/v2/upload")
//      .method("POST", body)
//      .addHeader("Content-Type", "multipart/form-data")
//      .addHeader("Authorization", "TlxzRSaVJj0o7HFZOd9sgdf4Jl60RA00")
//      .addHeader("user-agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")
//      .addHeader("Cookie", "SMMSrememberme=42417%3A10e8e9cb5281082b493fdee73381aeb2dca0bd3d; PHPSESSID=1gjog2em3ogof23vrqi79vd41m; SM_FC=runWNk3mPIiL8mzl%2FrlEfzM940LRKjLm182cm2qDrm4%3D")
//      .build();
//    Response response = client.newCall(request).execute();
//    String result = response.body().string();
//    System.out.println(result);
////    String result = response.body().string();
//
//    Gson gson = new Gson();
//    java.lang.reflect.Type type = new TypeToken<Image_data>(){}.getType();
//    Image_data imge_data = gson.fromJson(result, type);
//    System.out.println(imge_data);
//    if (imge_data.getSuccess()){
//      System.out.println(imge_data.getData().getUrl());
//
//    }
//    else{
//      System.out.println("图片已经上传过一次！！");
//      System.out.println(imge_data.getImages());
//
//    }
//
//  }
    public String toUrl(String path) throws IOException {

//    String file_path = "E:/machine_learning/test8.jpg";

        String file_path = path;
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        MediaType mediaType = MediaType.parse("multipart/form-data");
        RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
                .addFormDataPart("smfile", file_path,
                        RequestBody.create(MediaType.parse("application/octet-stream"),
                                new File(file_path)))
                .addFormDataPart("format", "json")
                .build();
        Request request = new Request.Builder()
                .url("https://sm.ms/api/v2/upload")
                .method("POST", body)
                .addHeader("Content-Type", "multipart/form-data")
                .addHeader("Authorization", "TlxzRSaVJj0o7HFZOd9sgdf4Jl60RA00")
                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")
                .addHeader("Cookie", "SMMSrememberme=42417%3A10e8e9cb5281082b493fdee73381aeb2dca0bd3d; PHPSESSID=1gjog2em3ogof23vrqi79vd41m; SM_FC=runWNk3mPIiL8mzl%2FrlEfzM940LRKjLm182cm2qDrm4%3D")
                .build();
        Response response = client.newCall(request).execute();
        String result = response.body().string();
        System.out.println(result);
//    String result = response.body().string();

        Gson gson = new Gson();
        java.lang.reflect.Type type = new TypeToken<Image_data>() {
        }.getType();
        Image_data imge_data = gson.fromJson(result, type);
        System.out.println(imge_data);
        if (imge_data.getSuccess()) {
            System.out.println(imge_data.getData().getUrl());
            return imge_data.getData().getUrl();
        } else {
            System.out.println("图片已经上传过一次！！");
            System.out.println(imge_data.getImages());
            return imge_data.getImages();
        }
    }
}
