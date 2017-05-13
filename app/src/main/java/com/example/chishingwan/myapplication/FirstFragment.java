package com.example.chishingwan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Chi Shing Wan on 5/13/2017.
 */

public class FirstFragment extends Fragment {

    Button btLogin;
    EditText etName;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        bindViews(view);
        return view;
    }

    private void bindViews(View view) {
        btLogin = (Button) view.findViewById(R.id.bt_login);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), WelcomeActivity.class);
                String name = etName.getText().toString();
                intent.putExtra("Name", name);
                startActivity(intent);
            }
        });

        etName = (EditText) view.findViewById(R.id.et_name);
    }
}
