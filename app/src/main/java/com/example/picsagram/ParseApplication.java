package com.example.picsagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Registers parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Z53drzwvfuBOw0U9ziyzdekeRPBFT467csz0zZNq")
                .clientKey("pRa9lupBmdWb2lf3uGIMoP5Wb5P2elGQ9AQa30T2")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
