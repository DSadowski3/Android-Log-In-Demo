package com.aoji.logindemo;

import android.app.Application;

import com.aoji.logindemo.Data.User;

/**
 * Created by dsadowski2001 on 5/22/16.
 */
public class RESRServiceApplicaiton extends Application {
    private static RESRServiceApplicaiton instance;
    private User user;
    private String accessToken;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        user = new User();
    }

    public static RESRServiceApplicaiton getInstance(){
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
