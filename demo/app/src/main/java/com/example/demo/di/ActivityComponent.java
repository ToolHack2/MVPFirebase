package com.example.demo.di;

import com.example.demo.di.module.ActivityModule;
import com.example.demo.ui.login.LoginActivity;
import com.example.demo.ui.register.RegisterActivity;

import dagger.Component;

@PerActivity
@Component (dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(RegisterActivity registerActivity);

    //void inject(LoginActivity loginActivity);
}

