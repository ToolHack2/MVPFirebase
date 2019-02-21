package com.example.demo.ui.register;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.demo.MainActivity;
import com.example.demo.R;
import com.example.demo.ui.base.BaseActivity;
import com.example.demo.ui.login.LoginActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity implements RegisterMvpView {

    @Inject
    RegisterMvpPresenter presenter;


    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.btn_register)
    Button btnRegister;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ButterKnife.bind(this);
        getActivityComponent().inject(this);

        //presenter.setViewRegister(this, this);
    }

    @Override
    public void registerSuccess() {
        Toast.makeText(this, "Dang ky thanh cong", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void registerFail() {
        Toast.makeText(this, "Dang ky that bai", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void emtyEmail() {
        Toast.makeText(this, "Email khong hop le", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void emtyPassword() {
        Toast.makeText(this, "Password phai du 6 ky tu", Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_register)
    public void onClick(View view) {
        presenter.registerClicked(edtEmail.getText().toString(), edtPassword.getText().toString());
    }
}
