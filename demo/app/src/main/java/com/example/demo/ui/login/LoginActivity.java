package com.example.demo.ui.login;

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
import com.example.demo.ui.base.MvpPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginView,LoginPresenterInt>
        implements LoginView {


    @BindView(R.id.log_email)
    EditText logEmail;
    @BindView(R.id.log_pass)
    EditText logPass;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected LoginPresenterInt getPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }


    @Override
    public void navigateMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @OnClick( R.id.btn_login)
    public void onClick(View view) {
        mPresenter.login(logEmail.getText().toString(), logPass.getText().toString());
    }
}
