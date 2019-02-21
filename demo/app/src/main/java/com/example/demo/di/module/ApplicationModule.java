package com.example.demo.di.module;

import android.app.Application;
import android.content.Context;

import com.example.demo.di.ApplicationContext;
import com.example.demo.di.PerActivity;
import com.example.demo.ui.register.RegisterPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mapplication;

    public ApplicationModule(Application mapplication) {
        this.mapplication = mapplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {return mapplication;}

    @Provides
    Application provideApplication() {return mapplication;}

}
