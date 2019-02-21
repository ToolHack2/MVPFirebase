package com.example.demo.ui.register;

import android.content.Context;

import com.example.demo.ui.base.MvpPresenter;

public interface RegisterMvpPresenter {
    void registerClicked(String email, String password);
    //void setViewRegister(Context context, RegisterMvpView registerMvpView);
}
