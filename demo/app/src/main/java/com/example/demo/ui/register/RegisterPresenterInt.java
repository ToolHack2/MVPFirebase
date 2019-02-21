package com.example.demo.ui.register;


import com.example.demo.ui.base.MvpPresenter;
import com.example.demo.ui.base.MvpView;

public interface RegisterPresenterInt extends MvpPresenter<RegisterView> {

//    boolean isViewDetached();
    void register(String email, String password);

}
