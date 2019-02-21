package com.example.demo.ui.register;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.example.demo.R;
import com.example.demo.ui.base.MvpPresenter;
import com.example.demo.ui.base.MvpView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterPresenter<V extends RegisterView> implements RegisterPresenterInt<V> {

    private RegisterView mView;


    @Override
    public void onAttach(V mvpView) {
        this.mView = mvpView;
    }

    @Override
    public void onDetach() {
        mView = null;
    }

    @Override
    public void register(String email, String password) {

        if (TextUtils.isEmpty(email)) {
            mView.showMessage("email ko hop le");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mView.showMessage("password chua dung");
            return;
        }
        registerFirebase(email, password);
    }


    private void registerFirebase(String email, String password) {

        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            mView.navigateLogin();
                        } else {
                            mView.showMessage("dang ki that bai");
                        }
                    }
                });
    }




}
