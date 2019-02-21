package com.example.demo.di;

import android.app.Application;
import android.content.Context;

import com.example.demo.MyApp;
import com.example.demo.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApp myApp);

    @ApplicationContext
    Context getContext();

    Application getApplication();

}
