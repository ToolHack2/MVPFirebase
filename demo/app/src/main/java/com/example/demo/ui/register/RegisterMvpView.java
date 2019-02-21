package com.example.demo.ui.register;

import com.example.demo.ui.base.BaseView;

public interface RegisterMvpView extends BaseView {

    void registerSuccess();
    void registerFail();
    void emtyEmail();
    void emtyPassword();
}
