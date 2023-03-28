package com.example.distri.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.distri.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        if (view.getId()== R.id.btncrear){
            Intent RegisterUser = new Intent(this,Register_user.class);
            startActivity(RegisterUser);
        }else if (view.getId()==R.id.btnlogin2){
            Intent RegisterUser = new Intent(this,login_user.class);
            startActivity(RegisterUser);
        }
    }
}