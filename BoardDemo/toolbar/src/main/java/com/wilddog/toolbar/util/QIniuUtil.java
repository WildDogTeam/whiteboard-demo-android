package com.wilddog.toolbar.util;


import com.qiniu.android.storage.UploadManager;

/**
 * Created by he on 2017/8/30.
 */

public class QIniuUtil {

//    private static final String token = "c-UScZmj-1C-7hPrmIiIN1Iz8XiuK_u0pvPhMQSz:g4REMu1osUgNyBX-toT-M7q8lQo=:eyJzY29wZSI6IndpbGRkYW9nIiwiZGVhZGxpbmUiOjMwMTk0NjQ3NDN9";
    private static final String token = "qSIHb2rWYZNiE80039Uyk7PpiaWTNwdPnRsvzmM-:FFjx2CzRcxGaDZQWQnAwonQud4Q=:eyJzY29wZSI6IndoaXRlYm9hcmQiLCJyZXR1cm5Cb2R5Ijoie1wibmFtZVwiOiAkKGZuYW1lKSxcImtleVwiOiAkKGtleSksXCJzaXplXCI6ICQoZnNpemUpLFwid2lkdGhcIjogJChpbWFnZUluZm8ud2lkdGgpLFwiaGVpZ2h0XCI6ICQoaW1hZ2VJbmZvLmhlaWdodCksXCJoYXNoXCI6ICQoZXRhZyl9IiwiZGVhZGxpbmUiOjMwMjAwMTU0NTJ9";
//    private static final String token = "c-UScZmj-1C-7hPrmIiIN1Iz8XiuK_u0pvPhMQSz:1GiXKvDITwK7jCRLRT-cZXCPjlA=:eyJyZXR1cm5Cb2R5ICI6IntcbiAgICAgIFwibmFtZVwiOiAkKGZuYW1lKSxcbiAgICAgIFwic2l6ZVwiOiAkKGZzaXplKSxcbiAgICAgIFwid1wiOiAkKGltYWdlSW5mby53aWR0aCksXG4gICAgICBcImhcIjogJChpbWFnZUluZm8uaGVpZ2h0KSxcbiAgICAgIFwiaGFzaFwiOiAkKGV0YWcpXG59Iiwic2NvcGUiOiJ3aWxkZGFvZyIsImRlYWRsaW5lIjozMDE5NDg5MzkyfQ==";
    private static final String url = "http://ovwpvt4dz.bkt.clouddn.com/";
//    private static final String url = "http://ovdjdglum.bkt.clouddn.com/";

    private static QIniuUtil instance;
    private UploadManager uploadManager;

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

    public void init(){
        uploadManager = new UploadManager();
    }


    public UploadManager getUploadManager() {
        return uploadManager;
    }

    public String getURL(String key) {
        return url+key;
    }
}
