package com.guard.config;

import com.guard.listener.UploadProgressListener;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class MultipartResolver extends CommonsMultipartResolver {

    @Autowired
    private UploadProgressListener progressListener;

    @Override
    protected MultipartParsingResult parseRequest(HttpServletRequest request) throws MultipartException {
        String encoding = super.determineEncoding(request);
        progressListener.setSession(request.getSession());
        FileUpload fileUpload = prepareFileUpload(encoding);
        fileUpload.setProgressListener(progressListener);
        try {
            List<FileItem> fileItemList = ((ServletFileUpload) fileUpload).parseRequest(request);
            return super.parseFileItems(fileItemList, encoding);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
        return null;
    }
}
