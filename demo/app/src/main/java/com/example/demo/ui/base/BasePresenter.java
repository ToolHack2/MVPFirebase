package com.example.demo.ui.base;

import com.example.demo.ui.login.LoginView;

public class BasePresenter<VIEW extends MvpView> implements MvpPresenter<VIEW> {

    public VIEW mView;

    @Override
    public void onAttach(VIEW mvpView) {
        mView = mvpView;
    }

    @Override
    public void onDetach() {
        mView = null;
    }
}
