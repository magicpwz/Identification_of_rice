package com.guard.listener;


import com.guard.pojo.ProgressEntity;
import org.apache.commons.fileupload.ProgressListener;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

@Component
public class UploadProgressListener implements ProgressListener {

    private HttpSession session;

    public void setSession(HttpSession session){
        this.session = session;
        ProgressEntity pe = new ProgressEntity();
        session.setAttribute("uploadStatus", pe);
    }


    /**
     *  设置当前已读取文件的进度
     * @param readBytes 已读的文件大小（单位byte）
     * @param allBytes 文件总大小（单位byte）
     * @param index 正在读取的文件序列
     */
    @Override
    public void update(long readBytes, long allBytes, int index) {
        ProgressEntity pe = (ProgressEntity) session.getAttribute("uploadStatus");
        pe.setReadBytes(readBytes);
        pe.setAllBytes(allBytes);
        pe.setCurrentIndex(index);
    }
}
