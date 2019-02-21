package com.example.demo;

import android.app.Application;
import android.content.Context;

import com.example.demo.di.ApplicationComponent;
import com.example.demo.di.DaggerApplicationComponent;
import com.example.demo.di.module.ApplicationModule;

import dagger.android.DaggerApplication;

public class MyApp extends Application {

protected ApplicationComponent applicationComponent;

    public static MyApp get(Context context) {
        return (MyApp)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                                .applicationModule(new ApplicationModule(this))
                                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getComponent() {return applicationComponent;}
}
