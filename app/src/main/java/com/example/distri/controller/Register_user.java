package com.example.distri.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.distri.Dao.DaoUsuario;
import com.example.distri.R;
import com.example.distri.model.Usuario;
import com.google.android.material.textfield.TextInputEditText;

public class Register_user extends AppCompatActivity {
    private TextInputEditText nombre;
    private TextInputEditText correo;
    private TextInputEditText clave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);
        this.nombre = findViewById(R.id.txtnombre);
        this.correo = findViewById(R.id.txtcorreoregistro);
        this.clave = findViewById(R.id.txtclaveregistro);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.BtnRegistrarUsuario) {
            boolean retorno;
            String c1 = nombre.getText().toString();
            String c2 = correo.getText().toString();
            if (c1.isEmpty() || c2.isEmpty()) {
                retorno = false;
                Toast toast1 = Toast.makeText(getApplicationContext(),
                        "DE LLENAR TODOS LOS CAMPOS ", Toast.LENGTH_SHORT);
                toast1.show();
            } else {
                retorno = true;

                Usuario object = new Usuario();
                DaoUsuario dao = new DaoUsuario();
                object.setNombre(nombre.getText().toString());
                object.setCorreo(correo.getText().toString());
                object.setClave(clave.getText().toString());
                object.setEstado(1);
                if (dao.craete(object, this) == true) {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "CREADO CORRECTAMENTE "
                            , Toast.LENGTH_SHORT);
                    toast1.show();
                    Intent RegisterUser = new Intent(this, login_user.class);
                    startActivity(RegisterUser);
                    fileList();
                } else {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "HAY PROBLEMAS EN LA BASE DE DATOS  "
                            , Toast.LENGTH_SHORT);
                    toast1.show();
                }
            }
        }
    }
}