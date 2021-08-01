package com.guard.tool;

import com.google.gson.annotations.SerializedName;

@lombok.NoArgsConstructor
@lombok.Data
public class Image_data {

    private Boolean success;
    private String code;
    private String message;
    private DataBean data;
    private String images;
    @SerializedName("RequestId")
    private String requestId;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataBean {
        private Integer file_id;
        private Integer width;
        private Integer height;
        private String filename;
        private String storename;
        private Integer size;
        private String path;
        private String hash;
        private String url;
        private String delete;
        private String page;
    }
}
