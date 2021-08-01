package com.guard.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class api_service {

    public String recognize(String path){
        //此处的path是图片路径
        Process proc;
        String res = null;
        try {
            System.out.println("接受到的参数"+path);
            String[] cmd = new String[] { "python", "E:\\machine_learning\\predict.py", path};
            proc = Runtime.getRuntime().exec(cmd);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = null;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                res = line;
            }
            in.close();
            proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(res+">>>>>>>>>>>");
        return res;
    }
}
