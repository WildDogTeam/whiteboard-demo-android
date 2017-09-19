package com.wilddog.boarddemo;

import android.app.Application;

import com.wilddog.toolbar.util.QIniuUtil;

/**
 * Created by he on 2017/9/19.
 */

public class App extends Application {
    private static final String token = "";

    private static final String url = "";

    @Override
    public void onCreate() {
        super.onCreate();
        QIniuUtil.getInstance().init(token,url);
    }
}
