package com.manidevs.mvpexample.login.root;

import com.manidevs.mvpexample.login.LogginActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject(LogginActivity target);
}
