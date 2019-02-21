package com.example.demo.ui.login;


public interface LoginPresenterInt {

    void onAttach(LoginView view);

    void onDetach();

    boolean isViewDetached();

    void login(String email, String password);
}
