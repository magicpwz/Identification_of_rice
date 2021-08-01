package com.guard.pojo;

import org.springframework.stereotype.Component;


/**
 * 上传进度实体类
 */
@Component
public class ProgressEntity {
    private long readBytes = 0L; //到目前为止读取文件的比特数
    private long allBytes = 0L;    //文件总大小
    private int currentIndex;      //目前正在读取第几个文件

    public long getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(long readBytes) {
        this.readBytes = readBytes;
    }

    public long getAllBytes() {
        return allBytes;
    }

    public void setAllBytes(long allBytes) {
        this.allBytes = allBytes;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    @Override
    public String toString() {
        return "ProgressEntity{" +
                "readBytes=" + readBytes +
                ", allBytes=" + allBytes +
                ", currentIndex=" + currentIndex +
                '}';
    }
}

