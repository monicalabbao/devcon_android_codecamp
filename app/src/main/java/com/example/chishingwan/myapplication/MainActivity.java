package com.example.chishingwan.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    Button btLogin;
    Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
        loadFragment();
    }

    private void loadViews() {
        btLogin = (Button) findViewById(R.id.bt_login);
        btRegister = (Button) findViewById(R.id.bt_register);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment();
            }
        });
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadRegister();
            }
        });
    }

    private void loadFragment() {
        FirstFragment firstFragment = new FirstFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.container, firstFragment);
        transaction.commit();
    }

    private void loadRegister() {
        SecondFragment secondFragment = new SecondFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.container, secondFragment);
        transaction.commit();
    }
}
