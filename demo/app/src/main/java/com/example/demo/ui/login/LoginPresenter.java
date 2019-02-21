package com.example.demo.ui.login;

public class LoginPresenter implements LoginPresenterInt {

    private LoginView mView;

    @Override
    public void onAttach(LoginView view) {
        mView = view;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    @Override
    public boolean isViewDetached() {
        return mView == null;
    }

    @Override
    public void login(String email, String password) {
        //...
    }
}
