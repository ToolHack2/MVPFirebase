package com.example.demo.ui.base;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


import com.example.demo.ui.login.LoginPresenter;
import com.example.demo.ui.login.LoginPresenterInt;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity<VIEW extends MvpView, PRESENTER extends MvpPresenter<VIEW>>
        extends AppCompatActivity
        implements MvpView {

    private ProgressDialog progressDialog;

    private Unbinder unbinder;

    public PRESENTER mPresenter;

    protected abstract PRESENTER getPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);
        mPresenter = getPresenter();
        mPresenter.onAttach((VIEW) this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDetach();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    }
}
