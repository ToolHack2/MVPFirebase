package com.example.demo.ui.register;


public interface RegisterPresenterInt {

    void onAttach(RegisterView view);

    void onDetach();

    boolean isViewDetached();

    void register(String email, String password);

}
