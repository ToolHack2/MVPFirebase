package com.example.demo.ui.register;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.example.demo.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterPresenter implements RegisterPresenterInt {

    private RegisterView mView;

    @Override
    public void onAttach(RegisterView view) {
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
    public void register(String email, String password) {

        if (TextUtils.isEmpty(email)) {
            mView.toast("email ko hop le");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            mView.toast(R.string.email_invalid);
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
                            mView.toast("dang ki that bai");
                        }
                    }
                });
    }


}
