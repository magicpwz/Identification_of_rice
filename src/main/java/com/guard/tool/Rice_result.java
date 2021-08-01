package com.guard.tool;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Rice_result {
    private String msg;
    private String result;

    public static String convertdata(String msg) {
        if (msg.equals("Rice koji disease")) {
            return "稻曲病";
        } else if (msg.equals("Rice fleck")) {
            return "稻胡麻斑病";
        } else if (msg.equals("Rice blast")) {
            return "稻瘟病";
        } else if (msg.equals("Sheath blight")) {
            return "纹枯病";
        } else {
            return "";
        }
    }


}
