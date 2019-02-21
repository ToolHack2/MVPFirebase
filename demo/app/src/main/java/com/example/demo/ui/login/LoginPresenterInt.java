package com.example.demo.ui.login;


import com.example.demo.ui.base.MvpPresenter;

public interface LoginPresenterInt extends MvpPresenter<LoginView> {

    void login(String email, String password);
}
