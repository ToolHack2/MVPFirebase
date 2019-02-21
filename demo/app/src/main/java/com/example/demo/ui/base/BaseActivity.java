package com.example.demo.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import com.example.demo.MyApp;
import com.example.demo.di.ActivityComponent;

import com.example.demo.di.module.ActivityModule;


import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements MvpView {

    private ProgressDialog progressDialog;

    private ActivityComponent activityComponent;

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        activityComponent = DaggerActivityComponent.builder()
//                .activityModule(new ActivityModule(this))
//                .applicationComponent(((MyApp)getApplication()).getComponent()).build();
    }

    public ActivityComponent getActivityComponent()
    {
        return activityComponent;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }
}
