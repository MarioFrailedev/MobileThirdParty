package com.manidevs.mvpexample.login;

public interface LoginActivityMVP {

    interface View {
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showInputError();
        void showUserSaveMessage();

        void setFirstName(String fname);
        void serLasTname(String lname);

    }

    interface Presenter {
        void setView(LoginActivityMVP.View view);

        void loginButtonClicked();

        void getCurrentUser();

    }

    interface Model{

        void createUser(String Fname, String lname);

        User getUser();

    }
}
