package com.example.demo.ui.register;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;

import com.example.demo.ui.base.BaseActivity;
import com.example.demo.ui.base.MvpView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterPresenter implements RegisterMvpPresenter{

    private ProgressDialog progressDialog;
    private RegisterMvpView registerView;
    private FirebaseAuth auth = FirebaseAuth.getInstance();
    private  RegisterActivity registerActivity;
    private Context context;

    @Override
    public void registerClicked(String email, String password) {
        if (email == null || email.equals(""))
        {
            registerView.emtyEmail();
        }else if (password == null || password.equals(""))
        {
            registerView.emtyPassword();
        }else
        {
            registerFirebase(email, password);
        }
    }

//    @Override
//    public void setViewRegister(Context context, RegisterMvpView registerMvpView) {
//        this.registerView = registerMvpView;
//        this.context = context;
//
//    }

    private void registerFirebase(String email, String password) {
        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener( registerActivity   , new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful())
                        {
                            registerView.registerSuccess();
                        }
                        else
                        {
                            registerView.registerFail();
                        }
                    }
                });
    }


}
