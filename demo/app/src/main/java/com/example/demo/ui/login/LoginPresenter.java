package com.example.demo.ui.login;

import android.support.annotation.NonNull;

import com.example.demo.ui.base.BasePresenter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginPresenter extends BasePresenter<LoginView> implements LoginPresenterInt {

    @Override
    public void login(String email, String password) {
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isComplete())
                        {
                            mView.showMessage("Dang nhap thanh cong");
                            mView.navigateMain();
                        }
                        else
                            mView.showMessage("Dang nhap that bai");
                    }
                });
    }
}
