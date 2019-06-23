package com.manidevs.mvpexample.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.manidevs.mvpexample.R;

import javax.inject.Inject;

public class LogginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    private EditText firstName;
    private EditText lastName;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void showUserNotAvailable() {

    }

    @Override
    public void showInputError() {

    }

    @Override
    public void showUserSaveMessage() {

    }

    @Override
    public void setFirstName(String fname) {

    }

    @Override
    public void serLasTname(String lname) {

    }
}
