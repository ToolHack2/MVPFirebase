package com.example.demo.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.example.demo.di.ActivityComponent;
import com.example.demo.di.ActivityContext;
import com.example.demo.di.PerActivity;
import com.example.demo.ui.login.LoginMvpPresenter;
import com.example.demo.ui.login.LoginPresenter;
import com.example.demo.ui.register.RegisterMvpPresenter;
import com.example.demo.ui.register.RegisterPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    private AppCompatActivity compatActivity;

    public ActivityModule(AppCompatActivity mcompatActivity) {this.compatActivity = mcompatActivity; }

    @Provides
    @ActivityContext
    Context provideContext() {return compatActivity;}

    @Provides
    AppCompatActivity provideAppcomatActivity() {return compatActivity;}

    @Provides
    @PerActivity
    RegisterMvpPresenter registerMvpPresenter(RegisterPresenter registerPresenter)
    {
        return registerPresenter;
    }

//    @Provides
//    @PerActivity
//    LoginMvpPresenter loginMvpPresenter(LoginPresenter loginPresenter)
//    {
//        return loginPresenter;
//    }
}
