package com.example.demo.ui.login;

import android.support.annotation.StringRes;

public interface LoginView {

    void navigateMain();

    void toast(String string);

    void toast(@StringRes int res);
}
