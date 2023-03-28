package com.example.distri.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.distri.R;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClick(View view) {
        if (view.getId()==R.id.cvMaquillaje){
            Intent viewRegisterUser = new Intent(this, lister_product_maquillaje.class);
            startActivity(viewRegisterUser);
        }else if (view.getId()==R.id.cvHogar){
            Intent viewRegisterUser = new Intent(this, lister_product_hogar.class);
            startActivity(viewRegisterUser);
        }else if (view.getId()==R.id.cvNiñas){
            Intent viewRegisterUser = new Intent(this, lister_product_ninas.class);
            startActivity(viewRegisterUser);
        }else if (view.getId()==R.id.cvAccesorios){
            Intent viewRegisterUser = new Intent(this, lister_product_accesorios.class);
            startActivity(viewRegisterUser);
        }else if (view.getId()==R.id.cvPerfumes){
            Intent viewRegisterUser = new Intent(this, lister_produc_perfumes.class);
            startActivity(viewRegisterUser);
        }else if (view.getId()==R.id.cvCarteras){
        Intent viewRegisterUser = new Intent(this, lister_product_carteras.class);
        startActivity(viewRegisterUser);
}
}
}