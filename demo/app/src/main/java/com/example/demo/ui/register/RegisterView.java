package com.example.demo.ui.register;

import android.support.annotation.StringRes;

import com.example.demo.ui.base.BaseView;

public interface RegisterView extends BaseView {

    void navigateLogin();

    void toast(String string);

    void toast(@StringRes int res);
}
