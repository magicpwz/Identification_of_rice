package com.guard.tool;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Image_data_twice {

    private Boolean success;
    private String code;
    private String message;
    private String images;
    @SerializedName("RequestId")
    private String requestId;
}
