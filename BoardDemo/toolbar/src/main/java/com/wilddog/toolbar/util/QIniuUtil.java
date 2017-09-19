package com.wilddog.toolbar.util;


import com.qiniu.android.storage.UploadManager;

/**
 * Created by he on 2017/8/30.
 */

public class QIniuUtil {

    private static QIniuUtil instance;
    private UploadManager uploadManager;
    private String token;
    private String url;

    private QIniuUtil() {

    }

    public static QIniuUtil getInstance() {
        if (instance == null) {
            synchronized (QIniuUtil.class) {
                if (instance == null) {
                    instance = new QIniuUtil();
                }
            }
        }
        return instance;
    }

    public String getToken() {
        return token;
    }

    public void init(String token, String url){
        this.token = token;
        this.url = url;
        uploadManager = new UploadManager();
    }


    public UploadManager getUploadManager() {
        return uploadManager;
    }

    public String getURL(String key) {
        return url+key;
    }
}
