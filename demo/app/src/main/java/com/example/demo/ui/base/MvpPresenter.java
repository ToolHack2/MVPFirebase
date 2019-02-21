package com.example.demo.ui.base;

public interface MvpPresenter<VIEW extends MvpView> {

    void onAttach(VIEW mvpView);

    void onDetach();

}
